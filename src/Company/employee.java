package Company;

public class employee {
	private String ID;
	private String name;
	private double salary;
	
	public String getID() {
			return ID;
	}
	public void setID(String id) {
			ID = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void work(){
		System.out.println("一天工作八小时！");
	}
}
	


