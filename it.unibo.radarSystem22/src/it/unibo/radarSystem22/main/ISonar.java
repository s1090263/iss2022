package it.unibo.radarSystem22.main;

public interface ISonar {
	  public void activate();
	  public void deactivate();
	  public IDistance getDistance();
	  public boolean isActive();
}