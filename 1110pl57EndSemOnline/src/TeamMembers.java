import java.util.List;
import java.util.ArrayList;

public class TeamMembers implements Emp {
	String type;
	public String role;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Tasks> getTasks() {
		return tasks;
	}

	public void setTasks(List<Tasks> tasks) {
		this.tasks = tasks;
	}

	List<Tasks> tasks = new ArrayList<Tasks>();

	@Override
	public void initialise() {
		// TODO Auto-generated method stub
		type = "TeamMembers";
	}

	@Override
	public void assign_role(String role) {
		// TODO Auto-generated method stub
		this.role = role;
	}

	@Override
	public void allocatetask(Tasks tasks) {
		// TODO Auto-generated method stub
		this.tasks.add(tasks);
	}

	public Tasks get_Task() {
		return null;

	}
}
