
public class Rectangle implements Shape{
	double length = 10;
	double width = 5;
	
	public double getArea() {
		return (length * width);
	}
	
	public double getPerimeter() {
		return (length * 2) + (width * 2) ;
	}

}
