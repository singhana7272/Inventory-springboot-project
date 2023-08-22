package com.anamika.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anamika.bean.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
