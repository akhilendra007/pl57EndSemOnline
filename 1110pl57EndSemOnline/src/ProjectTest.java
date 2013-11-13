import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTest {

	Projects proj=new Projects("SRM");
	
	@Before
	public void setUp() throws Exception {
		proj.assign_team();
	}

	@Test
	public void test() {
		assertEquals("SRM",proj.get_projectname());
	}
	
	public void tes1() {
		assertEquals("SRM",proj.get_projectname());
	}
}
