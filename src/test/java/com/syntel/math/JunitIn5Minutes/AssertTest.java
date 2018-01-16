package com.syntel.math.JunitIn5Minutes;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		assertEquals(2, 2);
		assertTrue(true);
		assertFalse(false);
		assertNotNull(2);
		assertNull(null);
		assertNotEquals(2, 3);
		assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });
	}
}
