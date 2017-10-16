package com.param.stackroutehackathon.hackathon.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProfileDomain {
	@Id
	String userId;
	String name;
	String age;
}
