package Practice2_Project8_iv;

public class Emp 
{
	private int salary = 4000;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int bonus) {
		this.salary = salary+bonus;
	}

	@Override
	public String toString() {
		return "Emp [salary=" + salary + "]";
	}
		
}
