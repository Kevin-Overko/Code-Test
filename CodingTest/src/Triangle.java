
public class Triangle implements Shape{
	double side = 10;
	// given simply that the triangle is an equilateral
	
	public double getArea() {
		// b is height
		// a is half the length of side
		double a = .5 * side;
		double b = (side*(Math.sqrt(3))/2.0);
		return a * b;
		
	}
	public double getPerimeter() {
		return 3 * side;
	}
}
