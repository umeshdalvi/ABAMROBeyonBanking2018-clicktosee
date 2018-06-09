package com.amazonaws.lambda.demo;

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

		 Response response = (Response) responses.getResponses().get(0);
		 context.getLogger().log("Input: " + response);
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
					result.append("\""+ webEntity.getDescription().replace(" ", "+")+"\"" + "+");
				}else {
					result.append(webEntity.getDescription() +"+");
				}
				
			}
		}

		return result.toString();

		/*
		 * context.getLogger().log("Input: " + input);
		 * 
		 * // TODO: implement your handler return "Hello from Lambda ,My 1st Lamda!";
		 */ }

	

}
