package com.univariety.alumni.domain.subdomain.achievement;

import com.univariety.alumni.core.AbstractAchievementBaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AchievementDetail extends AbstractAchievementBaseEntity {

    private String title;
    private Integer year;
    private Integer month;
    private String achievementCode;
    private String description;
    private String webLink;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "achievementDetail")
//    private Set<AchievementTargetAudience> targetAudience = new HashSet<>();
}
