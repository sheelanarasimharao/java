package AutoMotori;
import static org.junit.Assert.*;

import org.junit.Test;


import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarRaceTest {


	@Mock
	
	Mootori mockengine;
	Ajaja mockdriver;
	
@Test
	public  void testLaskeNopeus() {
		Car testattava = new Car("BMW","x5",180,mockengine,mockdriver);
		Double paluuArvo;
		paluuArvo = testattava.laskeNopeus(8,4,180);
		
		assertEquals(90, paluuArvo,1);

				}
}