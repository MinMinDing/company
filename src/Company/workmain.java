package Company;

public class workmain {
	public static void main(String[] args) {
		employee a = new employee();
		a.setID("0001");
		a.setName("����");
		a.setSalary(3500.0);
		administration b = new administration();
		b.setID("0002");
		b.setName("���");
		b.setSalary(4000.0);
		b.setOtherSalary(800.0);
		manager c = new manager();
		c.setID("0003");
		c.setName("����");
		c.setSalary(6000.0);
		c.setOtherSalary(1000.0);
		c.setJiangjin(2000.0);
		
		
		System.out.println("��Ա��Ϣ��");
		System.out.print("���ţ�"+a.getID()+"\t"+"������"+a.getName()+"\t"+"�������ʣ�"+a.getSalary());
		System.out.println();
		a.work();
		System.out.println("***************************");
		
		System.out.println("��Ա��Ϣ��");
		System.out.print("���ţ�"+b.getID()+"\t"+"������"+b.getName()+"\t"+"�������ʣ�"+b.getSalary()+"\t"+"������"+b.getOtherSalary());
		System.out.println();
		b.work();
		System.out.println("***************************");
		
		System.out.println("��Ա��Ϣ��");
		System.out.print("���ţ�"+c.getID()+"\t"+"������"+c.getName()+"\t"+"�������ʣ�"+c.getSalary()+"\t"+"������"+c.getOtherSalary()+"\t"+"����"+c.getJiangjin());
		System.out.println();
		c.work();
		System.out.println("***************************");
				
	}

}
