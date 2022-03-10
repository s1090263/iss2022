package it.unibo.radarSystem22.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.unibo.radarSystem22.domain.interfaces.ISonar;
import it.unibo.radarSystem22.domain.mock.SonarMock;
import it.unibo.radarSystem22.domain.utils.BasicUtils;

public class TestSonar {
	
	@Before
	public void up() {
		System.out.println("up");
	}
	
	@After
	public void down() {
		System.out.println("down");
	}

	@Test
	public void testSonarMock() {		
		SonarMock sonar = new SonarMock();
		Thread r = new Thread(sonar);
		assertTrue(sonar.getDistance().getVal() == 90);
		r.start();
		BasicUtils.delay(1000);
		assertTrue(sonar.getDistance().getVal() != 90);
		r.stop();
	}

}
