package org.rahulyla.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.rahulyla.messenger.model.Message;
import org.rahulyla.messenger.model.Profile;

public class DatabaseClass {
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	

	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
	public static Map<Long, Message> getMessages() {
		// TODO Auto-generated method stub
		return messages;
	}
	
	
}
