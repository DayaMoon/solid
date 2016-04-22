package edu.endava.solid;

import java.util.ArrayList;
import java.util.List;

import edu.endava.solid.dip.UserService;
import edu.endava.solid.dip.UserServiceDB;
import edu.endava.solid.dip.UserServiceLDAP;
import edu.endava.solid.dip.UserViewController;
import edu.endava.solid.ocp.GraphicEditor;
import edu.endava.solid.ocp.Rectangle;
import edu.endava.solid.ocp.Shape;
import edu.endava.solid.ocp.Triangle;
import edu.endava.solid.srp.StandardDeviation;

public class MainApp{

	public static void main(String... args){

		System.out.println( Double.parseDouble("0.0"));
		System.out.println( Double.parseDouble(".0"));
		System.out.println( Double.parseDouble("0"));


		computeStdDev(); // Single Responsibility Principle


		initObjects(); //Open Close Principle


		drawUsersView(); //  dependency inversion principle
		                 //  May use 2 kinds of user resources.. adding a 3rd one is easy !!!

	}

	public static void drawUsersView(){
		UserViewController uvc = new UserViewController();

		//UserService  userServ = (UserService) new UserServiceLDAP();
		// or
		 UserService userServ = (UserService) new UserServiceDB();
		// or
		// some other Service provider

		uvc.setUserService(userServ);

		System.out.println(uvc.getAdminsView());

	}


	public static void computeStdDev(){
		List<Double> list = new ArrayList<>();
      list.add(3.2);
      list.add(2.0);
      list.add(6d);
      list.add(7d);
      list.add(2.5);
      list.add(5.3);
      // calls a fine grained implementation - many single purposed reusable methods.
      System.out.println("The Standard Deviation is: " + StandardDeviation.standardDeviation(list));

      // calls a coarse grained implementation - one single "super" method that does everything.
      System.out.println("The Standard Deviation is: " + StandardDeviation.getStandardDeviation(list));
	}


	public static void initObjects(){
		GraphicEditor ge = new GraphicEditor();

		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Rectangle());
		shapes.add(new Triangle());

		ge.setShapes(shapes);
		ge.drawCanvas();
	}
}
