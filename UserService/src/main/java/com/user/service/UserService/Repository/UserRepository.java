package com.user.service.UserService.Repository;

import com.user.service.UserService.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
