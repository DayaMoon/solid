package edu.endava.solid.lsp;

public class  Point3D extends Point2D {

	protected double z ;

	@Override
	public String toString()
	{
		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;

// THIS  ??
		if (getClass() != obj.getClass()) // breaks LSP
			return false;
		Point3D other = (Point3D) obj;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;

//OR THIS ??
		if ( obj 	instanceof Point3D ) {  // breaks commutativity
   		 Point3D that = (Point3D) obj ;
   		 return this.z == that.z && super.equals( that ) ;
   		 }
		else
		return super.equals( obj ) ;   // p2.equals(p3) == p3.equals(p2) DOES IT WORK??
	}
}
/**
 * for good OOP design favor composition over extension.
 */
