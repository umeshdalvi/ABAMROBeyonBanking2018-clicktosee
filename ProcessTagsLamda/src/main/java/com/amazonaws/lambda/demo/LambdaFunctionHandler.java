package com.amazonaws.lambda.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aws.dtos.Color;
import com.aws.dtos.Example;
import com.aws.dtos.ImagePropertiesAnnotation;
import com.aws.dtos.Response;
import com.aws.dtos.WebDetection;
import com.aws.dtos.WebEntity;

public class LambdaFunctionHandler implements RequestHandler<Example, String> {

	@Override
	public String handleRequest(Example responses, Context context) {

		Map<String, String> descriptionList = new HashMap();
		String output = null;
		StringBuffer finalResponse = new StringBuffer();
		 Response response = (Response) responses.getResponses().get(0);
		    
		 StringBuffer result = new StringBuffer();
		
		ImagePropertiesAnnotation imagePropertiesAnnotation = response.getImagePropertiesAnnotation();
		List<Color> colors = imagePropertiesAnnotation.getDominantColors().getColors();

		for (Color color : colors) {

			if (color.getScore() > .6) {
				float[] hsb = java.awt.Color.RGBtoHSB(color.getColor().getRed(), color.getColor().getGreen(),
						color.getColor().getBlue(), null);
				result.append(Float.toString(hsb[0])+"+");
				//descriptionList.put("Color", Float.toString(hsb[0]));
				break;
			}
		}

		WebDetection webDetections = response.getWebDetection();

		for (WebEntity webEntity : webDetections.getWebEntities()) {

			if (webEntity.getScore() > .8) {
				
				if(webEntity.getDescription().contains(" ")) {
					result.append("/\""+ webEntity.getDescription().replace(" ", "+")+"\"" + "+");
				}else {
					result.append(webEntity.getDescription() +"+");
				}
				
			}
		}
		String finalResult = result.toString() + webDetections.getBestGuessLabels().get(0).toString();
				//.substring(0, result.toString().length()-1);
		 try {
			 
			String s=  "http://ec2-34-246-163-189.eu-west-1.compute.amazonaws.com:9090//getProductDetails/v1?query="+URLEncoder.encode(finalResult,"UTF-8");
			context.getLogger().log("Input URL: " + s);
			URL url = new URL(s);
 	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
 	       conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				finalResponse.append(output);
			}

			conn.disconnect();

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }




		return finalResponse.toString();

		/*
		 * context.getLogger().log("Input: " + input);
		 * 
		 * // TODO: implement your handler return "Hello from Lambda ,My 1st Lamda!";
		 */ }

	

}
