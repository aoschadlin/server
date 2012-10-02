package com.simplefi.server.resources;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class UsersResource extends ServerResource {
    @Get
    public String toString() {
    	return "{\"id\":888, \"name\":\"Andre was here\"}";
    }
}
