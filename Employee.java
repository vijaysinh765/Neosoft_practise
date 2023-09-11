package interview.collection.comparable;

public class Employee implements Comparable{

	private int eid;
	private String ename;
	private double esalary;
	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getEsalary() {
		return esalary;
	}


	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}


	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		return this.ename.compareTo(e.getEname());
	}
}
