package com.piggymetrics.account;

import com.piggymetrics.account.utils.TestPostgresContainer;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceApplicationTests {

	@ClassRule
	public static TestPostgresContainer postgres = TestPostgresContainer.getInstance();

	@Test
	public void contextLoads() {

	}

}
