package org.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.messenger.model.Message;
import org.messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<String, Profile> getProfiles() {
		return profiles;
	}

	public static void cleanDatabase() {
		messages = new HashMap<>();
		profiles = new HashMap<>();
	}
}
