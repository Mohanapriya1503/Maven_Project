package com.Mavenproject;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class Ignore_Case {
	@Test(enabled = false)
	private void watsapp() {
		System.out.println("Whatsapp");
	}
	@Test(invocationCount = 2)
	private void insta() {
		System.out.println("Instagram");
    }
	@Ignore
	@Test
	private void tweet() {
	System.out.println("Tweeter");	
	}
	@Test
	private void fb() {
	System.out.println("Facebook");
	}
	@Test
	private void wkynmusic() {
	System.out.println("musicw");	
	}
	@Test
	private void spotify() {
    System.out.println("SPotify");
	}
	

}
