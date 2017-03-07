package com.ghj;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
private String hello;    
	
		@RequestMapping("/index")
		public String index(Map<String,Object> map){
			map.put("name", "ghj");
			return "index";
		}
}
