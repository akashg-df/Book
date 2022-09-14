package com.dream.filler.tracker.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "Address")
public class Address implements Serializable{
	
	private static final long serialVersionUID = 5236167009788898002L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	
	private String pincode;
	
	private String state;
	
	private String city;
	
	private String block;
	
	private String street;
	
	private String landmark;
	
	@OneToOne
	private UserInfo userInfo;

}
