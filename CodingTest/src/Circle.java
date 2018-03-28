
public class Circle implements Shape{
	double radius = 6;
	double radiusSqr = radius * radius;
	
	public double getArea() {
		return Math.PI * (radiusSqr);
	}
	public double getPerimeter() {
		return Math.PI * (2 * radius);
	}
	
}
