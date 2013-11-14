import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class SprintTesting {

	Sprint sprint=new Sprint();
	Story story=new Story("To create Login");
	Story story1=new Story("To create Home Page");
	Story story2=new Story("To create Registration Details");
	
	List<Tasks> tasks=new ArrayList<Tasks>();
	
	@Before
	public void setUp() throws Exception {
		story.definetask("Create login Layout",3);
		story.definetask("validate login",2);
		story.definetask("test login",7);
		
		
		sprint.addsprint(story);
		
	}
	@Test
	public void test() {
		assertEquals(false,sprint.show_team_progress());
	}
}
