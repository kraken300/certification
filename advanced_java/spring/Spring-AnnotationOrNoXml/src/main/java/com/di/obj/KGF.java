package com.di.obj;

import org.springframework.stereotype.Component;

@Component
public class KGF implements Movie{
	@Override
	public void story() {
		System.out.println("KGF Movie Story");
	}
}
