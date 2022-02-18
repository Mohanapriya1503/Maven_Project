package com.Mavenproject;

import org.testng.annotations.Test;

public class Prioritytest {
        @Test(priority = 0,invocationCount = 3,timeOut = 3000)
		private void hsc() {
			System.out.println("Hsc");
		}
        @Test(priority = -5,enabled = false)
		private void sslc() {
			System.out.println("sslc");
	}
        @Test(priority = 2)
		private void job() {
			System.out.println("Job");
		}
        @Test(priority = 1)
		private void college() {
			System.out.println("college");
		}

	}


