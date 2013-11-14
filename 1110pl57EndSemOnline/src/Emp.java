import java.util.List;


public interface Emp {
	
	public void initialise();
	public void assign_role(String role);
	public String getRole();
	public List<Tasks> getTasks();
	public void allocatetask(Tasks tasks);
	public Tasks get_Task();
}
