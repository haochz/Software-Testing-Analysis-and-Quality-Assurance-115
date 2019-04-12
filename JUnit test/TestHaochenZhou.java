import static org.junit.Assert.*;
import org.junit.Test;

public class TestHaochenZhou {
	
	int id = 23567813;
	HaochenZhou info = new HaochenZhou();

	@Test 
	public void testFullName() {
		System.out.println("test getFullName()");
		assertEquals("Haochen Zhou",info.getFullName());
	}
	
	@Test
	public void testFirstName() {
		System.out.println("test getFirstName()");
		assertEquals("Haochen",info.getFirstName());
	}
	
	@Test
	public void testLastName() {
		System.out.println("test getLastName()");
		assertEquals("Zhou",info.getLastName());
	}	
	
	@Test
	public void testUCInetID() {
		System.out.println("test getUCInetID()");
		assertEquals("haochz3",info.getUCInetID());
	}	
	
	@Test
	public void testStudentNumber() {
		System.out.println("test getStudentNumber()");
		assertEquals(23567813,info.getStudentNumber());
	}	
	
	@Test
	public void testpositiveRotatedFullName() {
		System.out.println("test positive getRotatedFullName()");
		assertEquals("chen ZhouHao",info.getRotatedFullName(3));
	}
	
	@Test
	public void testnegativeRotatedFullName() {
		System.out.println("test negative getRotatedFullName()");
		assertEquals("houHaochen Z",info.getRotatedFullName(-3));
	}
	
}
