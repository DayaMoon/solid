package edu.endava.solid.lsp;

public class Point2D {

	protected double x ;
	protected double y ;

	@Override
	public String toString()
	{
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	/**
	- The behaviour will not be as expected if a Point3D is passed in.
	- Surely there is no problem with our code though!
	- The problem is with our expectations.

******************
* Two Solutions
******************
1. Lower expectations

/** Return a string representation of the point.
  * Postcondition: result is a string indicating at least the x and y values.
          @Override
      	 public  String toString() {...}

2. Prevent overrides

It would be poor practice to prevent an override of toString(), so use another name.
/** Return a string representation of the point.
    * Postcondition:

			 public final  String toString2D() {...}

	 * @param p
	 */
	void printPoint( Point2D p ) {
	    p.setX(1.0);
	    p.setY(2.0);
	    System.out.println( p.toString() );
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
/** You should document how your methods must be <b>Overriden</b>
 *   for
 *   Customer extends Person
 *   Employee extends Person
 *   FullTimeEmployee extends Person
 *
 *   The equals() method makes sense to exist only in Person class,
 *    where you evaluate the Identification  Number - idNumber field for equality
 *    and you use instanceOf operator
 *
 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	public double getX() {
		return x;
	}
	public void setX(double x)	{
		this.x = x;
	}
	public double getY()	{
		return y;
	}
	public void setY(double y)	{
		this.y = y;
	}


	//consider thisOrThat(...)
	void thisOrThat( Point2D p, Point2D q ) {
	    p.setX( 1 ) ;
	    p.setY( 2 ) ;
	    q.setX( 1 ) ;
	    q.setY( 2 ) ;

   	if ( p.equals( q ) )
   		{ /* do this... */ }
   	else
   		{ /*...do that... */}
	}
	/**
	 * thisOrThat(...) may not behave according to our expectations.
		For the case where x0 == x1, y0 == y1, and p.z != q.z
      We  violate the LSP !!!

******************
* Two Solutions
******************
1. Reduce Expectations.
-  We should reword the documentation of equals for Point2D to be more flexible
      Do two Point2D objects compare equal by the
      standard of their least common ancestor class?
      <p>  At this level the standard is equality of the x
      and y values.

2. Prevent overrides
	We wouldn’t want to prevent overrides of equals.
	We are better off providing a new name
	-- Are points equal as 2D points?

   public final boolean equals2D( Point2D that ) {
   return  this.x==that.x && this.y==that.y ; }
*/
}