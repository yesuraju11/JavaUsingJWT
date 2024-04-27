package com.javainuse.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.Entity.UserData;
@Repository
public interface UserDataRepo extends JpaRepository<UserData, Integer> {

	//UserData findByUsername(String username);

	//rData findByUsername(String username);

	UserData findByUserName(String userName);

}
