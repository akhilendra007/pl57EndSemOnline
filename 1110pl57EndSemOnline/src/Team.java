import java.util.ArrayList;
import java.util.List;

public class Team {
	public Team(List<Emp> teammembers2, Emp scrummaster, Emp productOwner,
			Emp customer) {
		// TODO Auto-generated constructor stub
		teammembers = teammembers2;
		product_owner = productOwner;
		scrum_master = scrummaster;
	}

	public Team() {
		// TODO Auto-generated constructor stub
	}

	public List<Emp> teammembers = new ArrayList<Emp>();
	public Emp product_owner;
	public Emp scrum_master;
	public Emp customer;

	public List<Emp> getTeammembers() {
		return teammembers;
	}

	public Emp getProduct_owner() {
		return product_owner;
	}

	public Emp getScrum_master() {
		return scrum_master;
	}

	public Emp getCustomer() {
		return customer;
	}

	public void allocate_task(List<Tasks> task) {
		// TODO Auto-generated method stub
		for (int i = 0; i < teammembers.size(); i++) {
			teammembers.get(i).allocatetask(task.get(i));
		}
	}

	public boolean show_team_progress() {
		// TODO Auto-generated method stub
		return false;
	}
}
