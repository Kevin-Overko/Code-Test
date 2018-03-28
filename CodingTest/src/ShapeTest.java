import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class ShapeTest {
	Shape rectangleTest = new Rectangle();
	Shape triangleTest = new Triangle();
	Shape circleTest = new Circle();
	
	@Test
	public void test() {
		//delta floating point in assertEquals()...using .1 error	
		// pass rectangle...triangle...circle
		// length = 10, width = 5
		assertEquals( 30, rectangleTest.getPerimeter(), .1);
		assertEquals( 50, rectangleTest.getArea(), .1);
		
		// side = 10 (Equilateral Triangle)
		assertEquals( 30, triangleTest.getPerimeter(), .1);
		assertEquals( 43.3, triangleTest.getArea(), .1);
		
		// radius = 6
		assertEquals( 37.7, circleTest.getPerimeter(), .1);
		assertEquals( 113.1, circleTest.getArea(), .1);
		
	}

}
