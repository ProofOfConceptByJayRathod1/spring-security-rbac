package com.springsecurity.rbac.springsecurityrbac.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class JwtUserResponse {
    private String token;
    private LocalDateTime expiry;

	public JwtUserResponse() {
		super();
	}

	public JwtUserResponse(String token, LocalDateTime expiry) {
		super();
		this.token = token;
		this.expiry = expiry;
	}

	@Override
	public String toString() {
		return "JwtUserResponse [token=" + token + ", expiry=" + expiry + "]";
	}

	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public LocalDateTime getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDateTime expiry) {
		this.expiry = expiry;
	}
    
    
    
}
