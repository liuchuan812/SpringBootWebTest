package com.example.SpringBootWebTest;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWebTestApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("SpringBootWebTestApplicationTests--------------- --->");
		assertFalse(7 < 6);
	}

}
