package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import logic.*;
import org.junit.*;
public class Testlogic {

	@Test
	public void test() {
		assertEquals(4,Cal.findMax(new int[] {1,3,4,2}));
		//fail("Not yet implemented");
	}

}

