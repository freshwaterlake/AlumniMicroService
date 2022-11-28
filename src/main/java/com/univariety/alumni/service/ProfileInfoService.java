package com.univariety.alumni.service;

import com.univariety.alumni.domain.subdomain.profile.BasicProfile;
import com.univariety.alumni.domain.aggregate.ProfileInfo;
import com.univariety.alumni.repository.ProfileInfoRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileInfoService {

    @Autowired
    ProfileInfoRepository repository;

    public ProfileInfo createProfile(String source) {
        ProfileInfo profileInfo = new ProfileInfo(source);
        return repository.save(profileInfo);
    }

    public ProfileInfo save(UUID profileId, BasicProfile basicProfile) {
        ProfileInfo profileInfo = repository.getReferenceById(profileId);
        profileInfo.addBasicInfo(basicProfile);
        return repository.save(profileInfo);
    }

    public ProfileInfo updateBasicProfile(UUID profileId, BasicProfile basicProfile) {
        ProfileInfo profileInfo = repository.getReferenceById(profileId);
        profileInfo.getBasicProfile().setFirstName(basicProfile.getFirstName());
        profileInfo.getBasicProfile().setLastName(basicProfile.getLastName());
        profileInfo.getBasicProfile().setEmail(basicProfile.getEmail());
        profileInfo.getBasicProfile().setEmail(basicProfile.getEmail());
        return repository.save(profileInfo);
    }
}
