package com.boot.controller;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;

import com.boot.App;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

@RunWith(JUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class ShipwreckRepositoryIntegrationTest {

	@Autowired
	private ShipwreckRepository shipwreckRepository;
	
	@Test
	public void testFindAll() {
		List<Shipwreck> wrecks = shipwreckRepository.findAll();
		//assertThat(wrecks.size(), is(greaterThanOrQeualTo(0)));
		
	}
	
}
