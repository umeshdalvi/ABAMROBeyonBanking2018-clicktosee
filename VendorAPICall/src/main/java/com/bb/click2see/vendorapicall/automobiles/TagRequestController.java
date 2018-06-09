/**
 * 
 */
package com.bb.click2see.vendorapicall.automobiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bb.click2see.vendorapicall.dto.Product;

@Controller
@RequestMapping("/")
public class TagRequestController {
  
	/*public TagRequestController() {
		System.out.println("Umesh: 1");
	}*/
	//@Autowired
	private final int myId = 10;
    
    
	@GetMapping("hello-world")
	@ResponseBody
    public Product getProduct(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
		return new Product(myId,name);
    }
}
