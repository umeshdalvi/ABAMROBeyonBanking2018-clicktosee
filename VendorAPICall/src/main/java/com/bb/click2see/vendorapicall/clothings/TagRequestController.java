/**
 * 
 */
package com.bb.click2see.vendorapicall.clothings;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.bb.click2see.vendorapicall.dto.ResponseProduct;
import com.bb.click2see.vendorapicall.dto.ResponseProductList;
import com.bb.click2see.vendorapicall.dto.clothings.response.ClothingAPIResponse;
import com.bb.click2see.vendorapicall.dto.clothings.response.Product;

@Controller
@RequestMapping("/clothings")
public class TagRequestController {
  
	private static final String APIURL = "https://api.asos.com/product/search/v1/?";
	
	//@Autowired
	private final int myId = 10;
    
    
	@GetMapping("/getProductDetails/v1")
	@ResponseBody
    public ResponseProductList getProduct(@RequestParam(name="id", required=false, defaultValue="0") String id,
    		@RequestParam(name="query", required=false, defaultValue="0") String query) throws URISyntaxException {
		
		RestTemplate restTemplate = new RestTemplate();
		
		StringBuilder params = new StringBuilder();
		params.append("q="+query);
		params.append("&store=1");
		params.append("&lang=en-GB");
		params.append("&sizeschema=EU");
		params.append("&currency=EUR");
		params.append("&sort=freshness");
		params.append("&channel=mobile-app");
		params.append("&offset=0");
		params.append("&limit=10");
		
		String finalUrl = APIURL+params.toString();
		System.out.println("APIURL: "+finalUrl);
		URI uri = new URI(finalUrl);
		
		ClothingAPIResponse clothProductList = restTemplate.getForObject(uri, ClothingAPIResponse.class);
		
		ResponseProductList responseProductList = prepareResponseProductList(clothProductList.getProducts());
		return responseProductList;
    }


	private ResponseProductList prepareResponseProductList(List<Product> clothProductList) {

		List<ResponseProduct> productList = new ArrayList<>();
		for(Product clothProduct:clothProductList) {
			ResponseProduct product = new ResponseProduct();
			product.setId(clothProduct.getId());
			product.setName(clothProduct.getName());
			product.setPrice(clothProduct.getPrice().getCurrent().getValue());
			product.setImagePath(clothProduct.getBaseImageUrl());
			product.setDescription(fetchDescription(clothProduct));
			productList.add(product);
		}
		return new ResponseProductList(productList);
	}


	private String fetchDescription(Product clothProduct) {
		StringBuilder desc = new StringBuilder();
		desc.append("\nBrand: ").append(clothProduct.getBrandName())
		.append("\nColour:").append(clothProduct.getColour())
		.append("\nType:").append(clothProduct.getProductType());
		return desc.toString();
	}
	
	
}
