/**
 * 
 */
package com.web.es.ordenpago.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cgarcia
 *
 */

@Controller
public class HomeController {

	 @RequestMapping("/")
	    public String index() {
	        return "redirect:swagger-ui.html";
	    }
}
