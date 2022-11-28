package com.univariety.alumni.core;

import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@AllArgsConstructor
@MappedSuperclass
public abstract class AbstractAggregateRootEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "BINARY(16)")
    private UUID id;

    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    @Version
    private int version;

    public AbstractAggregateRootEntity() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

}
