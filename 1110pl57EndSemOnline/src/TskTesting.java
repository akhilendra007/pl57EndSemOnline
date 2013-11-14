import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TskTesting {
	Tasks task=new Tasks("Tovalidate",20);
	Tasks ctask=new Tasks("Cross Tovalidate",20);
	@Before
	public void setUp() throws Exception {
		task.set_complete(true);
	}

	@Test
	public void test() {
		assertEquals(true,task.isCompleted());
		assertEquals(false,ctask.isCompleted());
	}

}
