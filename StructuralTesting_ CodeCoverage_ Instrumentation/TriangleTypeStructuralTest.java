import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTypeStructuralTest {


	@Before
	public void setUp() throws Exception {
	}

	// Iftekhar: This is a dummy test case, which you can replace.
	@Test
	public void testTriangleType() {
		assertEquals(1, TriangleType.triangleType(2, 3, 4));
	}
	
	
	@Test
	public void testConstructor()
	{
		TriangleType t = new TriangleType();
		int i = 1;
		assertEquals(i,t.triangleType(3,4,5));
	}
	
	@Test
	public void testNegative() {
		int r = TriangleType.triangleType(-1,2,3);
		assertEquals(r,4);
		
		int r2 = TriangleType.triangleType(1,-2,3);
		assertEquals(r2,4);
		
		int r3 = TriangleType.triangleType(1,2,-3);
		assertEquals(r3,4);
	}
	
	@Test
	public void testBoundary() {
		int r = TriangleType.triangleType(1001,300,900);
		assertEquals(r,5);
		
		int r2 = TriangleType.triangleType(900,300,1001);
		assertEquals(r2,5);
	}
	
	@Test
	public void testIso() {
		int r = TriangleType.triangleType(5,3,5);
		assertEquals(r,2);
		
		int r2 = TriangleType.triangleType(3,5,5);
		assertEquals(r2,2);
	}
	
	@Test
	public void testNonTri() {
		int r = TriangleType.triangleType(1,2,5);
		assertEquals(r,4);
		
		int r2 = TriangleType.triangleType(5,2,1);
		assertEquals(r2,4);
		
		int r3 = TriangleType.triangleType(2,5,1);
		assertEquals(r3,4);
		
	}
	
	@Test
	public void testNonTri2() {
		int r = TriangleType.triangleType(1,1,5);
		assertEquals(r,4);
		
		int r2 = TriangleType.triangleType(5,1,1);
		assertEquals(r2,4);
		
		int r3 = TriangleType.triangleType(1,5,1);
		assertEquals(r3,4);
		
	}
	
	@Test
	public void test() {
		int r = TriangleType.triangleType(1,1,1);
		assertEquals(r,3);
	}
	
	

}
