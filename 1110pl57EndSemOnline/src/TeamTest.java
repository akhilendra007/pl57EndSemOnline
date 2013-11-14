import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TeamTest {
	Emp scrummaster=new ScrumMaster();
	
	@Before
	public void setUp() throws Exception {
		scrummaster.assign_role("You are responsible");
	}

	@Test
	public void test() {
		assertEquals("You are responsible",scrummaster.getRole());
	}

}
