package com.univariety.alumni.domain.subdomain.achievement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AchievementTargetAudience {

    @Id
    private Integer id;
    private String targetAudienceCode;

    @OneToOne
    @JoinColumn(name = "achievementId", referencedColumnName = "id", nullable = false)
    private AchievementDetail achievementDetail;
}
