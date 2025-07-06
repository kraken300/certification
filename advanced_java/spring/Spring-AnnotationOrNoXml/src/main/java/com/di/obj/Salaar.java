package com.di.obj;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Salaar implements Movie{
	@Override
	public void story() {
		System.out.println("Salaar Movie Story");
	}
}
