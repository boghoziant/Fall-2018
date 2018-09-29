package recursion;

public class Triangle extends Shape {
/*	Triangle
	- side1: double
	- side2: double
	- side3: double

	+Triangle()
	+Triangle(side1: double, side2: double, side3: double)
	+Triangle(side1: double, side2: double, side3: double, color: string, filled: boolean)
	+setSide1(side1: double): void
	+setSide2(side2: double): void
	+setSide3(side3: double): void
	+getSide1(): double
	+getSide2(): double
	+getSide3(): double
	-getBase(): double (optional)
	-getHeight(): double (optional)

	implement (Override) these methods
	+getArea(): double
	+getPerimeter(): double
	*/
	
	double side1;
	double side2;
	double side3;
	
	public Triangle()
	{
		// constructor
		System.out.println("New instance');
	}
	
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
		this.filled = filled;
		
	}
	
	public void setSide1(double side1)
	{
		this.side1 = side1;
		
	}
	public void setSide2(double side2)
	{
		this.side2 = side2;
		
	}
	public void setSide3(double side3)
	{
		this.side3 = side3;
		
	}
	
	public double getArea()
	{
		int area = (base * height) / 2;
		return area;
	}
	
	public double getPerimeter()
	{
		int perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
}
