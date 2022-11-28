package com.univariety.alumni.core;

import com.univariety.alumni.domain.Preferences;
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
import lombok.ToString;

@Data
@AllArgsConstructor
@MappedSuperclass
@ToString
public abstract class AbstractPreferencesBaseEntity {

    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_guid", referencedColumnName = "id")
    private Preferences preferences;

    @Version
    private int version;

    public AbstractPreferencesBaseEntity() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
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
        AbstractPreferencesBaseEntity other = (AbstractPreferencesBaseEntity) obj;
        return Objects.equals(this.id, other.getId());
    }

}
