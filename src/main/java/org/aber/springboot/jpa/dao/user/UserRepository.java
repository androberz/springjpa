package org.aber.springboot.jpa.dao.user;

import org.aber.springboot.jpa.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
