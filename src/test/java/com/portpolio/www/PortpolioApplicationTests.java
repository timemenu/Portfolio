package com.portpolio.www;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.portfolio.www.PortfolioApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PortfolioApplication.class)
@WebAppConfiguration
public class PortpolioApplicationTests {

	@Test
	public void contextLoads() {
	}

}
