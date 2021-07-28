package tn.esprit.spring;


import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.controller.AdminController;


public class AdminTest extends SoftIbApplicationTests {

	@Autowired
	AdminController ac;
	
	@Test
	public void testgetAllAdmin() {
		ac.getalladmin();
	}

}
