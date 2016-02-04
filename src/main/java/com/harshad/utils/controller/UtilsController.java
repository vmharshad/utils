package com.harshad.utils.controller;

import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harshad.utils.model.Base64;

@RestController
@RequestMapping("/utils")
@Component
public class UtilsController {

	@RequestMapping(path="/encode", method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public Base64 base64Encode(@RequestBody Base64 base64) {
		System.out.println(base64);
		System.out.println(base64.getInput());
		if (null == base64) base64 = new Base64();
		
		if (null == base64.getInput()) 
			base64.setOutput("");
		else 
			base64.setOutput(Base64Utils.encodeToString(base64.getInput().getBytes()));
		
		return base64;
	}
	
	@RequestMapping("/decode")
	public String base64Decode(String input) {
		if (null == input) return "";
		return new String (Base64Utils.decode(input.getBytes()));
	}
}
