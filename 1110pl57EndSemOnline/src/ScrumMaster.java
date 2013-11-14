import java.util.ArrayList;
import java.util.List;


public class ScrumMaster implements Emp{
	String type;
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
	List<Tasks> tasks=new ArrayList<Tasks>();
	public String role;
	@Override
	public void initialise() {
		// TODO Auto-generated method stub
		type="ScrumMaster";
	}
	public void assign_role(String role) {
		// TODO Auto-generated method stub
		this.role=role;
	}
	@Override
	public void allocatetask(Tasks tasks) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Tasks get_Task() {
		// TODO Auto-generated method stub
		return null;
	}
}
