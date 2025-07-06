package com.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadProperties {

	@Value(value = "${db.url}")
	private String url;

	@Value(value = "${db.username}")
	private String username;

	@Value(value = "${db.password}")
	private String password;

	@Value(value = "${secret.key}")
	private String secretKey;

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getSecretKey() {
		return secretKey;
	}
}
