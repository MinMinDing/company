package Company;

public class manager extends administration {
	private double jiangjin;

	public double getJiangjin() {
		return jiangjin;
	}


	public void setJiangjin(double jiangjin) {
		this.jiangjin = jiangjin;
	}


	void work(){
		System.out.println("一天工作八小时！");
		System.out.println("我有管理能力！");
		System.out.println("我有外交能力！");
	}

}
