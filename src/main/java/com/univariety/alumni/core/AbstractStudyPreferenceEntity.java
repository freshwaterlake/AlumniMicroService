package com.univariety.alumni.core;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.univariety.alumni.domain.aggregate.StudyPreference;
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
public abstract class AbstractStudyPreferenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_guid", referencedColumnName = "id", nullable = false)
    private StudyPreference studyPreference;

    @Version
    private int version;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @JsonBackReference
    public StudyPreference getProfileInfo() {
        return studyPreference;
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
        AbstractStudentBaseEntity other = (AbstractStudentBaseEntity) obj;
        return Objects.equals(this.id, other.getId());
    }
}
