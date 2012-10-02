package com.simplefi.server.resources;

import org.json.JSONArray;
import org.json.JSONObject;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class UserResource extends ServerResource {
    @Get
    public String toString() {
		JSONObject jsonObj = new JSONObject();

		int userId = 0;
		Object obj = getRequestAttributes().get("id");
		if (obj != null)
			userId = Integer.parseInt(obj.toString());

		try {
			if (userId > 0) {
				// Load user from DB   ZZZ
				jsonObj.put("id", userId);
				jsonObj.put("firstName", "Andre");
				jsonObj.put("lastName", "Oschadlin");
				jsonObj.put("url", "http://localhost:4080/simplefi/user/" + Integer.toString(userId));
				
				return jsonObj.toString();
			}
		} catch (Exception e) {
			System.out.println("Unable to setup JSON response");
		}

		try {
			jsonObj.put("response", "404");
		} catch (Exception e) {
			System.out.println("Unable to log error :-)");
		}
		return jsonObj.toString();

    }
}
