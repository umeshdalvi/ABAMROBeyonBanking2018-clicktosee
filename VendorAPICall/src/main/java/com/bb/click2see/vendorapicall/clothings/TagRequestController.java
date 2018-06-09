/**
 * 
 */
package com.bb.click2see.vendorapicall.clothings;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.bb.click2see.vendorapicall.dto.Product;
import com.bb.click2see.vendorapicall.dto.ProductList;
import com.bb.click2see.vendorapicall.dto.clothings.ClothProductList;

@Controller
@RequestMapping("/clothings")
public class TagRequestController {
  
	/*public TagRequestController() {
		System.out.println("Umesh: 1");
	}*/
	//@Autowired
	private final int myId = 10;
    
    
	@GetMapping("/getProductDetails/v1")
	@ResponseBody
    public Product getProduct(@RequestParam(name="id", required=false, defaultValue="0") String id,
    		@RequestParam(name="query", required=false, defaultValue="0") String query) {
		
		/*RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8080/spring-rest/foos";
		Map<String, String> uriVariables = new HashMap();
		uriVariables.put("tags", query);
		ClothProductList clothProductList = restTemplate.getForObject(fooResourceUrl, ClothProductList.class , query, id );
		
		ProductList productList = prepareResponseProductList(clothProductList);*/
		return new Product();
    }


	private ProductList prepareResponseProductList(ClothProductList clothProductList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
