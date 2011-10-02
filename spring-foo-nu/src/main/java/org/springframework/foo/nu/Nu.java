package org.springframework.foo.nu;

import org.apache.log4j.Logger;
import org.springframework.foo.mu.Mu;

public class Nu {

	private static final Logger logger = Logger.getLogger(Nu.class);

	private final Mu mu;

	public Nu(Mu mu) {
		this.mu = mu;
		if (logger.isTraceEnabled()) {
			logger.trace("Create " + this);
		}
	}

	public Mu getMu() {
		return this.mu;
	}
}
