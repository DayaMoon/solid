package edu.endava.solid.dip;

import java.util.List;


public interface UserService
{

	List<User> getAdminUsers();

	User getCurrentlyLoggedUser();

}