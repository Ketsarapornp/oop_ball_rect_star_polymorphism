//∫Õ≈«‘Ëß·∫∫ Polymorphism
public class Vector
{
	public double x,y;
	public Vector()
	{
		x = 0;
		y = 0;
	}
	public Vector(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public Vector add(Vector v)
	{
		return new Vector(x + v.x,y + v.y);
	}
	public static void main(String[] args)
	{
		Vector a = new Vector(3,4);
		Vector b = new Vector(4,5);
		Vector c = a.add(b);
		System.out.println(c.x + " " + c.y);
	}
}

