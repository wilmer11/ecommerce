package com.keycode.userservice.repository;

import com.keycode.userservice.entity.User;
import com.keycode.userservice.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
