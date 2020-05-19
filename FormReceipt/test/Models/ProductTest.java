package Models;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class ProductTest {
		
	private Product product = new Product();
	
	@Test
	void getUnitPriceTest() {
		product.setUnitPrice(5);
		assertEquals(5, product.getUnitPrice());
	}
	
	@Test
	void getDescriptionTest() {
		product.setDescription("The product has the best mark and prime materia");
		assertEquals("The product has the best mark and prime materia",product.getDescription());
	}
}
