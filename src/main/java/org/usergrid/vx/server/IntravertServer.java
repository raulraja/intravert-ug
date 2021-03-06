package org.usergrid.vx.server;

import org.apache.cassandra.service.AbstractCassandraDaemon;
import org.vertx.java.deploy.Verticle;

public class IntravertServer {

	public static void main(String[] args) {
		
			System.setProperty("cassandra-foreground", "true");
			System.setProperty("log4j.defaultInitOverride","true");
			System.setProperty("log4j.configuration", "log4j.properties");
			AbstractCassandraDaemon.initLog4j();
			
			IntravertServer is = new IntravertServer();
			is.startServer();
		
	}
	
	private void startServer() {
		UsergridCassandraDaemon ucd = new UsergridCassandraDaemon();
		ucd.activate();
	}

}
