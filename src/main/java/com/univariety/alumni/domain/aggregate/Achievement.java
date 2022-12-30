package com.univariety.alumni.domain.aggregate;

import com.univariety.alumni.core.base.AbstractAggregateRootEntity;
import com.univariety.alumni.domain.subdomain.achievement.AchievementDetail;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@ToString
public class Achievement extends AbstractAggregateRootEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "achievement", orphanRemoval = true)
    private Set<AchievementDetail> achievementDetails = new HashSet<>();
}
