package edu.endava.solid.dip;

import java.util.List;

import edu.endava.solid.dip.UserService;

public class UserViewController
{

	UserService userService;

	//URL Request mapping maps "/admins"
	public String getAdminsView()
	{
		List<User> users = userService.getAdminUsers();
		//add users to the view model
		//and return the model
		return "admins";
	}

	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}
}