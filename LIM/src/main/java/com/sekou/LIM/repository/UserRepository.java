package com.sekou.LIM.repository;

import com.sekou.LIM.enity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
