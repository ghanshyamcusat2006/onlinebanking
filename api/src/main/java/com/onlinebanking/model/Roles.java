package com.onlinebanking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Roles {
 
	@Id
	@GeneratedValue
	private int rolesId;
	
	@Column(name="role_name")
	private String roleName;

	public int getRolesId() {
		return rolesId;
	}

	public void setRolesId(int rolesId) {
		this.rolesId = rolesId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
