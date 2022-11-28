package com.univariety.alumni.core;

import com.univariety.alumni.domain.aggregate.ProfileInfo;
import java.time.LocalDateTime;
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
public abstract class AbstractBaseEntity {

    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_guid", referencedColumnName = "id")
    private ProfileInfo profileInfo;

    @Version
    private int version;

    public AbstractBaseEntity() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

}
