package emma.emma;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testa() {
			int x = 2;
		if (x == 0) {
			System.out.println("X is zero");
		} else {
			System.out.println("X is invalid");
		}
	}
	
	@Test
	public void testb() {
		
		for (int x = 0; x < 5; x++) {
			  System.out.println(x);
			}
			}
}
