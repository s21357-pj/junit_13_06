import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Example1 {

	@Test
	public void test() {
		Example1 tester = new Example1(10, 5);
		 assertEquals(15, tester.addition());
		 assertEquals(5, tester.subtract());
	}

}
