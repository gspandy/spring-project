package org.springframework.foo.mu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MuTests {

	@Test
	public void test() {
		Mu mu = new Mu();
		assertTrue(mu.equals(mu));
	}

}
