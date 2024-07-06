package Day_11;

public class StudentsMain {

	public static void main(String[] args) {
		// using object reference variable
//		Students s=new Students();
//		s.sid=101;
//		s.sname="anil";
//		s.sgrade='A';
//		s.PrintStudentData();
//		
//		//  using method 
//		s.SetStudentData(102, "abhi", 's');
//		s.PrintStudentData();
		
		// using constructor
		Students s3=new Students(103,"kholi",'c');
		s3.PrintStudentData();
	}

}
