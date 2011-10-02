package org.springframework.foo.mu;

import org.apache.log4j.Logger;

public class Mu {
	private static final Logger logger = Logger.getLogger(Mu.class);

	public Mu() {
		if (logger.isTraceEnabled()) {
			logger.trace("Create " + this);
		}
	}
}
