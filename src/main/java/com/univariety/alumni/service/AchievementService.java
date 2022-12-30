package com.univariety.alumni.service;

import com.univariety.alumni.core.mappers.AchievementMapper;
import com.univariety.alumni.domain.aggregate.Achievement;
import com.univariety.alumni.repository.AchievementRepository;
import java.util.UUID;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AchievementService {

    @Autowired
    AchievementRepository repository;

    public Achievement getById(UUID profileId) {
        return repository.getReferenceById(profileId);
    }

    public Achievement save(UUID profileId, Achievement achievement) {
        final AchievementMapper mapper = Mappers.getMapper(AchievementMapper.class);
        Achievement achievementEntity = repository.getReferenceById(profileId);
        mapper.toAchievementEntity(achievement, achievementEntity);
        return repository.save(achievementEntity);
    }
}
