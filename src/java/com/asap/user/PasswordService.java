package com.asap.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordService 
{
	private static final BCryptPasswordEncoder 
			passwordEncoder = new BCryptPasswordEncoder();
			
	public static String hashPassword(String password)
	{
		return passwordEncoder.encode(password);
	}
	
	public static boolean verifyPassword(
			String password, String passwordHash)
	{
		return passwordEncoder.matches(password, passwordHash);
	}
}
