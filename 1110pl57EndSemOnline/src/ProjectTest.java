import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class ProjectTest {

	//1define team
	Projects proj=new Projects("SRM");
	
	Story story=new Story("To create Login");
	Story story1=new Story("To create Home Page");
	Story story2=new Story("To create Registration Details");
	
	List<Tasks> tasks=new ArrayList<Tasks>();
	
	@Before
	public void setUp() throws Exception {
		story.definetask("Create login Layout",3);
		story.definetask("validate login",2);
		story.definetask("test login",7);
		
		Sprint sprint=new Sprint();
		sprint.addsprint(story);
		proj.addsprint(sprint);	
	}

	@Test
	public void test() {
		assertEquals("SRM",proj.get_projectname());
	}
	@Test
	public void test1() {
		assertEquals("To create Login",story.getName());
	}
	@Test
	public void test2() {
		assertEquals(3,story.getTasks().size());
	}
	
}
