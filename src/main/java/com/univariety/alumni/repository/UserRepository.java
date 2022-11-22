package com.univariety.alumni.repository;

import com.univariety.alumni.domain.Alumni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Alumni, Long> {
}
