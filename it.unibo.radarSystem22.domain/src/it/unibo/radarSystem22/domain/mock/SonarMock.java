package it.unibo.radarSystem22.domain.mock;

import it.unibo.radarSystem22.domain.Distance;
import it.unibo.radarSystem22.domain.interfaces.IDistance;
import it.unibo.radarSystem22.domain.interfaces.ISonar;
import it.unibo.radarSystem22.domain.utils.BasicUtils;

public class SonarMock implements ISonar,Runnable {
	
	private Distance dist = new Distance(90);
	private boolean state = false;

	@Override
	public void activate() {
		state = true;
		compute();
	}

	@Override
	public void deactivate() {
		state = false;

	}

	@Override
	public IDistance getDistance() {
		return dist;	
	}

	@Override
	public boolean isActive() {
		return state;
	}
	
	public void compute() {
		for (int i= dist.getVal(); i>=0;i++) {
			dist = new Distance(i);
			BasicUtils.delay(250);
		}
		deactivate();
	}
	
	@Override
	public void run() {
		activate();
	}
	
}
