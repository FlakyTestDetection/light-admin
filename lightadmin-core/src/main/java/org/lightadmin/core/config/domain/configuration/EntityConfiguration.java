package org.lightadmin.core.config.domain.configuration;

import org.lightadmin.core.util.Transformer;

public class EntityConfiguration {

	private final Transformer<Object, String> nameExtractor;

	EntityConfiguration( final Transformer<Object, String> nameExtractor ) {
		this.nameExtractor = nameExtractor;
	}

	public Transformer<Object, String> getNameExtractor() {
		return nameExtractor;
	}
}