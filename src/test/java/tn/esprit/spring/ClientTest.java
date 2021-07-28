package tn.esprit.spring;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import tn.esprit.spring.controller.ClientController;

public class ClientTest extends SoftIbApplicationTests {
	

	@Autowired
	ClientController cc;
	
	@Test
	public void testgetUser() {
		cc.getClient();
	}

}
