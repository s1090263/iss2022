package it.unibo.radarSystem22;

import org.json.JSONException;

public interface IApplication {
	public void doJob( String domainConfig, String systemConfig ) throws JSONException;
	public String getName();
}
