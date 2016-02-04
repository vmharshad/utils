package com.harshad.utils;

import static org.junit.Assert.fail;
import org.junit.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.harshad.utils.controller.UtilsController;

public class UtilsControllerTest {
	@Autowired
	UtilsController controller;
	
	public void testBase64EncodeValidations() {
		Assert.assertTrue("".equals(controller.base64Encode(null)));
	}

}
