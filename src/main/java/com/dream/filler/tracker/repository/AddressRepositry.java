package com.dream.filler.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dream.filler.tracker.entity.Address;
import com.dream.filler.tracker.entity.UserInfo;

public interface AddressRepositry extends JpaRepository<Address, Long> {
	Address findByUserInfo(UserInfo userInfo);

}
