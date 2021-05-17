package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("This is my test app");
	}

	// stringTimes("Hi",2) -> "HiHI

	public String stringTimes(String str, int n){
		String  answer = "";
		for(int i= 0; i<n; i++){
			answer = answer+ str;
		}
		return answer;
	}
	@Test
	public void testStringTimes(){
		Assertions.assertEquals("HiHiHi", stringTimes("Hi",3));
		Assertions.assertEquals("HiHi", stringTimes("Hi",2));
		Assertions.assertEquals("Hi", stringTimes("Hi",1));
	}

}
