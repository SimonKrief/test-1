import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RibTest {

	@Test
	void testRib() {
		//fail("Not yet implemented");
		Rib rib= new Rib("126511325412A3J23125478");
		assertEquals(23, rib.getAccountNumber().length());//test de l'entrée


	}

	@Test
	void testReplace() {
		Rib rib =  new Rib("126511325412A3J23125478");
		//fail("Not yet implemented");
		assertEquals(23, rib.replace().length());//test de la méthode.
	}

	@Test
	void testCheck() {
		
		//fail("Not yet implemented");
	}

}
