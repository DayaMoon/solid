package edu.endava.solid.ocp.bad;



/**
 * Open-Close Principle - Bad example
 *
 *
 * GraphicEditor class has to be modified for every new shape class
 * - since it's not closed for modification
 * -- for each new shape added the unit testing of the GraphicEditor should be redone.
 * -- when a new type of shape is added the time for adding it will be high
 *      since the developer who add it should understand the logic of the GraphicEditor.
 * -- adding a new shape might affect the existing functionality in an undesired way, even if the new shape works perfectly

 * The drawing code is not inside concrete shape classes.
 * The Graphic Editor  has a lot of functionality
 *
 */
public class GraphicEditor2D {

	public void drawShape2D(Shape2D s) {
		if (s.m_type==1)
			drawRectangle2D(s);
		else if (s.m_type==2)
			drawCircle(s);
	}
	public void drawCircle(Shape2D r) {
		System.out.println("CIRCLE drawed");

	}
	public void drawRectangle2D(Shape2D r) {
		System.out.println("RECTANGLE drawed");
	}
}

