package Day_11;

public class Students {
	
	int sid;
	String sname;
	char sgrade;
	
	void PrintStudentData() {
		System.out.println(sid +" "+sname+" " + sgrade);
	}
	
	void SetStudentData(int id,String name,char grade) {
		sid=id;
		sname=name;
		sgrade=grade;
		
	}
	
	// using constructor
	
	Students(int id,String name,char grade){
		sid=id;
		sname=name;
		sgrade=grade;
	}

}
