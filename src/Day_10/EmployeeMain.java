package Day_10;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.eid =101;
		emp1.ename="vinod";
		emp1.job="software engineer";
		emp1.sal = 25000;
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.ename = "Anil";
		emp2.job = "Manager";
		emp2.sal = 100000;
		emp2.display();
		

	}

}
