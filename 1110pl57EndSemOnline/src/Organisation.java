import java.util.List;
import java.util.ArrayList;

public class Organisation {
	static List<Projects> project_list=new ArrayList<Projects>();
	Team team=new Team();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define team
		Projects proj=new Projects("SRM");
		add_project(proj);
		
		//create team
		assignTeam();
		print_team(project_list.get(0));
		
		//define story
		assign_story(project_list.get(0));
		
		//asssign sprint
		
	}
	private static void assign_story(Projects projects) {
		// TODO Auto-generated method stub
		Story story=new Story("To create Login ");
		story.setPriority(5);
		story.setStory_points(7);
		
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
