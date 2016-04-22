package edu.endava.solid.dip;

import java.util.List;


public class UserServiceDB implements UserService
{

	@Override
	public List<User> getAdminUsers()
	{
		System.out.println("Users return from DB");
		return null;
	}

	@Override
	public User getCurrentlyLoggedUser()
	{
		System.out.println("User from DB");
		return null;
	}
}