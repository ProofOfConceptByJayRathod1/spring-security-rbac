package com.springsecurity.rbac.springsecurityrbac.entity;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class JwtUserRequest {
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "JwtUserRequest [email=" + email + ", password=" + password + "]";
	}
	private String email;
	private String password;
}
