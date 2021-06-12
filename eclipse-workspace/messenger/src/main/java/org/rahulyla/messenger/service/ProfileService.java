package org.rahulyla.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.rahulyla.messenger.database.DatabaseClass;
import org.rahulyla.messenger.model.Profile;

public class ProfileService {
	private Map<String, Profile> profiles  = DatabaseClass.getProfiles();
	
	public ProfileService() {
		profiles.put("rahulya", new Profile(1L, "Rahulya", "rahulya", "Potla", new Date()));
	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getProfileName().isEmpty())
			return null;
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}
	
}
