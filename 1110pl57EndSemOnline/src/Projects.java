import java.util.List;


public class Projects {

	String project_name;
	Team team;
	Sprint sprint;
	
	public Team getTeam() {
		return team;
	}
	public Sprint getSprint() {
		return sprint;
	}
	public Projects(String string) {
		// TODO Auto-generated constructor stub
		this.project_name=string;
	}
	public String get_projectname() {
		// TODO Auto-generated method stub
		return project_name;
	}
	public void assign_team(Team team1) {
		// TODO Auto-generated method stub
		team=team1;
	}
	public void allocatetask(List<Tasks> task) {
		// TODO Auto-generated method stub
		team.allocate_task(task);
	}
	public void scrumboard() {
		// TODO Auto-generated method stub
		boolean result=sprint.show_team_progress();
		if(result==true)
		{
			System.out.println("\tSprint :-Completed");
		}
		else
		{
			System.out.println("\tSprint :-Incomplete");
		}
	}
	public void addsprint(Sprint sprint2) {
		// TODO Auto-generated method stub
		sprint=sprint2;
	}

}
