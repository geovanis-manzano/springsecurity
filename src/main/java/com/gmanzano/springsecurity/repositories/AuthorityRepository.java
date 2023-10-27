package com.gmanzano.springsecurity.repositories;

import com.gmanzano.springsecurity.model.Authority;
import com.gmanzano.springsecurity.utils.AuthorityName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByName(AuthorityName name);
}
