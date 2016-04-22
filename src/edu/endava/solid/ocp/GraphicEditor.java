package edu.endava.solid.ocp;

import java.util.List;


/**
*
* @author dmunteanu
*
* In the new design we use abstract draw() method in GraphicEditor for drawing objects,
* while moving the implementation in the concrete shape objects.
* Using the Open Close Principle the problems from the previous design are avoided,
* because GraphicEditor is not changed when a new shape class is added:
*
*   no unit testing required.
*   no need to understand the source code from GraphicEditor.
*   since the drawing code is moved to the concrete shape classes,
*   it's a reduced risk to affect old functionallity when new functionallity is added.
*
*/

/**
*
Benefit or Open Closed Design Principle:
1) Application will be more robust because we are not changing already tested class.
2) Flexible because we can easily accommodate new requirements.
3) Easy to test and less error prone.

How to make code extensible
Basic principle of making your code extensible and following open closed principle
	is providing object to class at run time and making use of polymorphism to invoke extended functionality.
If functionality is hard Coded
	than it wouldn’t be extensible but if you write interface and provide implementation of that interface at run time you make it extensible.

Read more: http://javarevisited.blogspot.com/2011/11/great-example-of-open-closed-design.html#ixzz3n1Wj4XPh

* @author dmunteanu
*
*/
//Open-Close Principle - Good example
public class GraphicEditor {

	private List<Shape> shapes;

	public void setShapes(List<Shape> shapes){
		this.shapes = shapes;
	}

	public void drawCanvas(){
		for (Shape shape : shapes){
			drawShape(shape);
		}
	}

	private void drawShape(Shape shape) {
		shape.draw();
	}
}