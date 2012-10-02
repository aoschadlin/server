package com.simplefi.server;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import com.simplefi.server.resources.UserResource;
import com.simplefi.server.resources.UsersResource;

public class SimpleFiApplication extends Application {
    /** 
     * Creates a root Restlet that will receive all incoming calls. 
     */  
    @Override  
    public synchronized Restlet createInboundRoot() {  
        // Create a router Restlet that routes each call to the  
        // appropriate resource.  
        Router router = new Router(getContext());  
  
        // Defines only one route
        router.attach("/user", UsersResource.class);  
        router.attach("/user/{id}", UserResource.class);  
  
        return router;  
    }  
}
