package com.univariety.alumni.core;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends AbstractAggregateRootEntity> extends
    JpaRepository<T, UUID> {

}
