package org.springframework.foo.nu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.foo.mu.Mu;

public class NuTests {

	@Test
	public void test() {
		Mu mu = new Mu();
		Nu nu = new Nu(mu);
		assertTrue(mu.equals(nu.getMu()));
	}

}
