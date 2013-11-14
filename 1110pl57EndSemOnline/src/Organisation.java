import java.util.List;
import java.util.ArrayList;

public class Organisation {
	static List<Projects> project_list=new ArrayList<Projects>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1define team
		Projects proj=new Projects("SRM");
		add_project(proj);
		
		//2create team
		assignTeam();
		print_team(project_list.get(0));
		
		//3define story
		Story story=assign_story(project_list.get(0),"To create Login");
		Story story1=assign_story(project_list.get(0),"To create Home Page");
		Story story2=assign_story(project_list.get(0),"To create Registration Details");
		
		//4define task
		story.definetask("Create login Layout",3);
		story.definetask("validate login",2);
		story.definetask("test login",7);
		
		//5asssign sprint
		assign_story_sprint(project_list.get(0),story);
		
		//6task_allocation
		task_allocate(project_list.get(0));
		
		//7scrumboard
		scrumboard(project_list.get(0));
		
	}
	private static void scrumboard(Projects projects) {
		// TODO Auto-generated method stub
		System.out.println("\n----------ScrumBoard-------\n");
		projects.getSprint().getStories().get(0).getTasks().get(0).set_complete(true);
		projects.getSprint().getStories().get(0).getTasks().get(1).set_complete(true);
		projects.scrumboard();
	}
	private static void task_allocate(Projects projects) {
		// TODO Auto-generated method stub
		List<Tasks> task= projects.getSprint().getStories().get(0).getTasks();
		System.out.println("\n------Tasks -------\n");
		for(int i=0;i<task.size();i++)
		{
			System.out.println(task.get(i).task);
		}
		projects.allocatetask(task);

	}
	private static void assign_story_sprint(Projects projects, Story story) {
		// TODO Auto-generated method stub
		System.out.println("\n----------Story points added-------\n");
		Sprint sprint=new Sprint();
		sprint.addsprint(story);
		project_list.get(0).addsprint(sprint);
		
	}
	private static Story assign_story(Projects projects, String string) {
		// TODO Auto-generated method stub
		Story story=new Story(string);
		story.setPriority(5);
		story.setStory_points(7);
		return story;
	}
	private static void print_team(Projects projects) {
		// TODO Auto-generated method stub
		System.out.println("Project Name:-" +projects.project_name);
		
		System.out.println("Assigned Roles:-" +projects.project_name);
		
		System.out.println("Customer:-" +projects.team.product_owner.getRole());
		System.out.println("ScrumMaster:-" +projects.team.scrum_master.getRole());
	}
	private static void add_project(Projects proj) {
		// TODO Auto-generated method stub
		project_list.add(proj);
		System.out.println("Project Created");
	}
	public static void assignTeam()
	{
		Emp coder=new TeamMembers();
		Emp tester=new TeamMembers();
		coder.assign_role("Coder");
		tester.assign_role("Tester");	
		
		Emp scrummaster=new ScrumMaster();
		Emp ProductOwner=new ProductOwner();
		
		scrummaster.assign_role("You are responsible");
		ProductOwner.assign_role("Yow Own the Project");
		List<Emp> teammembers=new ArrayList<Emp>();
		teammembers.add(coder);
		teammembers.add(tester);
		Team team1=new Team (teammembers,scrummaster,ProductOwner,null);
	
		project_list.get(0).assign_team(team1);
	}
}
