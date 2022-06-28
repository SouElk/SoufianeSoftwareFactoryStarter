package com.coppernic.rh.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatriceServiceImplTest {
	// private CalculatriceServiceImpl calculatriceService = new CalculatriceServiceImpl();
	
	@Autowired
	private CalculatriceServiceImpl calculatriceService; 

	
	
	@Test
	public void testAddition() {
		// initialisation des tests
		int x = 100;
		int y = 32;
		
		// appel du service
		int resultat = calculatriceService.addition(x, y);
		
		// verification/assertion
		assertEquals(132, resultat);
	}
	
	// @Test
	public void testSoustraction() {
		// initialisation des tests
		int x = 100;
		int y = 32;
		
		// appel du service
		int resultat = calculatriceService.soustraction(x, y);
		
		// verification/assertion
		assertEquals(69, resultat);
	}

}
