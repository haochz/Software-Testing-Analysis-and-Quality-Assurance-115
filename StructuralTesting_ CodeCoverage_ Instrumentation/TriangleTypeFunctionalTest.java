import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTypeFunctionalTest {

	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void test1() {
		int r = TriangleType.triangleType(10,10,3);
		assertEquals(r,2);
	}
	
	@Test
	public void test2() {
		int r = TriangleType.triangleType(-1,1001,1001);
		assertEquals(r,4);
	}
	
	@Test
	public void test3() {
		int r = TriangleType.triangleType(999,1000,998);
		assertEquals(r,1);
	}
	
	@Test
	public void test4(){
		int r = TriangleType.triangleType(1,2,20);
		assertEquals(r,4);
	}

	@Test
	public void test5(){
		int r = TriangleType.triangleType(300,1001,900);
		assertEquals(r,5);
	}
	
	@Test
	public void test6(){
		int r = TriangleType.triangleType(300,1000,800);
		assertEquals(r,1);
	}
	


}
