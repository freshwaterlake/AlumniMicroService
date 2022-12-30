package com.univariety.alumni.core.base;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.univariety.alumni.domain.aggregate.JobPreference;
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
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@ToString
@DynamicUpdate
public abstract class AbstractJobPreferenceBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_guid", referencedColumnName = "id", nullable = false)
    private JobPreference jobPreference;

    @Version
    private int version;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // Note: With out @JsonBackReference, JSON response is going into infinite loop
    @JsonBackReference
    public JobPreference getJobPreference() {
        return jobPreference;
    }

    @Override
    public int hashCode() {
        // return Objects.hashCode(this.id);
        return getClass().hashCode();
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
