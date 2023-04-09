package com.arrisdev.deploymentwithk8sdockerjenkinsMySql.repository;

import com.arrisdev.deploymentwithk8sdockerjenkinsMySql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
   List<User> findByEmailId(String emailId);
}
