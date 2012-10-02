package com.simplefi.server;

import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Hello world!
 *
 */
public class App extends ServerResource
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Starting server" );
        
        // Create a new Component.  
        Component component = new Component();
      
        // Add a new HTTP server listening on port 4080
        component.getServers().add(Protocol.HTTP, 4080);  
      
        // Attach the sample application.  
        component.getDefaultHost().attach("/simplefi",  new SimpleFiApplication());
      
        // Start the component.  
        component.start();
    }    
}
