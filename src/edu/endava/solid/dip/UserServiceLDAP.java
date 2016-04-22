package edu.endava.solid.dip;

import java.util.List;


public class UserServiceLDAP implements UserService
{

	@Override
	public List<User> getAdminUsers()
	{
		System.out.println("Users return from LDAP");
		return null;
	}

	@Override
	public User getCurrentlyLoggedUser()
	{
		System.out.println("User from LDAP");
		return null;
	}

}