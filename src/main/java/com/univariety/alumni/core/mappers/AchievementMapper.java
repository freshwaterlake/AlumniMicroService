package com.univariety.alumni.core.mappers;

import com.univariety.alumni.domain.aggregate.Achievement;
import org.mapstruct.AfterMapping;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED)
public interface AchievementMapper {

    @Mapping(target = "achievementOut.achievementDetails.attachment")
    void toAchievementEntity(Achievement achievementIn, @MappingTarget Achievement achievementOut);

    @AfterMapping
    default void afterMapping(Achievement achievement, @MappingTarget Achievement achievementOut) {
        achievementOut.getAchievementDetails().forEach(achievementDetail -> achievementDetail.setAchievement(achievement));

        achievementOut.getAchievementDetails().forEach(
            achievementDetail -> achievementDetail.getTargetAudience().forEach(target -> target.setAchievementDetail(achievementDetail)));
    }

}
