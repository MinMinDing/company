package Company;

public class workmain {
	public static void main(String[] args) {
		employee a = new employee();
		a.setID("0001");
		a.setName("张三");
		a.setSalary(3500.0);
		administration b = new administration();
		b.setID("0002");
		b.setName("李二");
		b.setSalary(4000.0);
		b.setOtherSalary(800.0);
		manager c = new manager();
		c.setID("0003");
		c.setName("王大");
		c.setSalary(6000.0);
		c.setOtherSalary(1000.0);
		c.setJiangjin(2000.0);
		
		
		System.out.println("雇员信息：");
		System.out.print("工号："+a.getID()+"\t"+"姓名："+a.getName()+"\t"+"基本工资："+a.getSalary());
		System.out.println();
		a.work();
		System.out.println("***************************");
		
		System.out.println("雇员信息：");
		System.out.print("工号："+b.getID()+"\t"+"姓名："+b.getName()+"\t"+"基本工资："+b.getSalary()+"\t"+"津贴："+b.getOtherSalary());
		System.out.println();
		b.work();
		System.out.println("***************************");
		
		System.out.println("雇员信息：");
		System.out.print("工号："+c.getID()+"\t"+"姓名："+c.getName()+"\t"+"基本工资："+c.getSalary()+"\t"+"津贴："+c.getOtherSalary()+"\t"+"奖金："+c.getJiangjin());
		System.out.println();
		c.work();
		System.out.println("***************************");
				
	}

}
