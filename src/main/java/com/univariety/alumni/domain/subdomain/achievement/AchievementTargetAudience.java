package com.univariety.alumni.domain.subdomain.achievement;

import com.univariety.alumni.core.base.AbstractAchievementDetailBaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AchievementTargetAudience extends AbstractAchievementDetailBaseEntity {

    private String targetAudienceCode;
}
