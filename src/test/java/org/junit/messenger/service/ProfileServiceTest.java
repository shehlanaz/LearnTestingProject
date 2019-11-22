package org.junit.messenger.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.messenger.model.Profile;
import org.messenger.service.ProfileService;

public class ProfileServiceTest {
	
	private ProfileService profileService = new ProfileService();
	
	@Test
	public void addProfileTest() {
		Profile profile = new Profile();
		profile.setId(1);
		profile.setFirstName("Ashrafi");
		
		Profile addedprofile = profileService.addProfile(profile);
		addedprofile.setFirstName("Iqbal");
		assertEquals(profile, addedprofile);
	}

}
