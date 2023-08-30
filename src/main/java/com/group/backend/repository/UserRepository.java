package com.group.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.group.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
