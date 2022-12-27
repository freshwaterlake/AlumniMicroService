package com.univariety.alumni.core;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.univariety.alumni.domain.subdomain.achievement.AchievementDetail;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@ToString
public class AbstractAchievementDetailBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "achievement_detail_id", referencedColumnName = "id", nullable = false)
    private AchievementDetail achievementDetail;

    @Version
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int version;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // Note: With out @JsonBackReference, JSON response is going into infinite loop
    @JsonBackReference
    public AchievementDetail getAchievementDetail() {
        return achievementDetail;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AbstractJobPreferenceBaseEntity other = (AbstractJobPreferenceBaseEntity) obj;
        return Objects.equals(this.id, other.getId());
    }
}
