package com.code.brigun.imp.models.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
*	created by brigun 11.24.16
*	based on an approach used by cbay in org.launchcode.stocks.models.util
*
*/

public class PasswordHash 
{
	private static final String salt = "third$green@%*&Turtledog><FishsevenTeeNtH";
	
	private static final String addSalt(String password)
	{
		String salted = salt + password;
		return salted;
	}
	
	public static String getMd5(String password)
	{
		String hash = null;
		String salted = addSalt(password);
		
		if (password == hash) return null;
		
		try
		{
			//Create MessageDigest object
			MessageDigest digest = MessageDigest.getInstance("MD5");
			
			
			// update digest with salted string
			digest.update(salted.getBytes(), 0, salted.length());
			
			// convert message digest to base 16
			hash = new BigInteger(1, digest.digest()).toString(16);
			
		}
		catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		
		return hash;
	}
	
	public static boolean isValidPassword(String password, String hash)
	{
		String toCheck = getMd5(password);
		return toCheck.equals(hash);
	}
	
	
	
}
