package Company;

public class administration extends employee {
	private double otherSalary;
	
	public double getOtherSalary() {
		return otherSalary;
	}

	public void setOtherSalary(double otherSalary) {
		this.otherSalary = otherSalary;
	}

	void work(){
		System.out.println("一天工作八小时！");
		System.out.println("我有管理能力！");
	}

}
