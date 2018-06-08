/**
 * 
 */
package com.bb.click2see.vendorapicall.automobiles;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bb.click2see.vendorapicall.dto.Product;

@RestController
@RequestMapping("/getautomobileproducts")
public class TagRequestController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public Product getProduct(@RequestParam(value="id", defaultValue="") int id) {
        return new Product(counter.incrementAndGet(),
                             id);
    }
}
