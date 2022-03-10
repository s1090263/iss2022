package it.unibo.radarSystem22.domain;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.unibo.radarSystem22.domain.interfaces.ILed;
import it.unibo.radarSystem22.domain.mock.LedMock;
import it.unibo.radarSystem22.domain.utils.DomainSystemConfig;

public class TestLed {

	@Before
	public void up() {
		System.out.println("up");
	}
	
	@After
	public void down() {
		System.out.println("down");
	}
	
	@Test
	public void testLedMockOn() {
		System.out.println("TestLedMockOn");
		DomainSystemConfig.simulation = true; //per lavorare in modo simulato
		
		//ILed led = DeviceFactory.createLed(); //la factory serve per costruire oggetti
		ILed led = new LedMock();
		
		assertTrue(!led.getState()); //voglio che all'inizio il led sia spento, come da specifica
	
		led.turnOn();
		assertTrue(led.getState());		
	}
	
	@Test
	public void testLedMockOff() {
		System.out.println("TestLedMockOff");
		//DomainSystemConfig.simulation = true;
		
		//ILed led = DeviceFactory.createLed(); //la factory serve per costruire oggetti
				ILed led = new LedMock();	
				
				assertTrue(!led.getState());
				
				led.turnOff();
				assertTrue(!led.getState());				
	}
}
