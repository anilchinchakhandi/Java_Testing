package Day_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String_Array_set_A1 {
	static String empDetails[] = new String[5];
	
	static List<String>gmailEmpDetails = new ArrayList<String>();
	static List<String>outlookEmpDetails= new ArrayList<String>();
	static List<String>othersEmpDetails= new ArrayList<String>();

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			empDetails[i]=scan.nextLine();
		}
		
		for(String empDetail : empDetails) {
			String[] details = empDetail.split(",");
			if(details.length==3) {
				String empId = details[0].trim();
				String email = details[1].trim();
				String name = details[2].trim();
				if(email.endsWith("@gmail.com")) 
				{ 
					gmailEmpDetails.add(empId + ","+email +","+name);
				}
				else if(email.endsWith("@outlook.com")) {
					outlookEmpDetails.add(empId + ","+email +","+name);
				}
				else {
					othersEmpDetails.add(empId + ","+email +","+name);
				}
			}
			else {
				System.out.println("Invalid users");
			}
			
		}
		for(String employee:gmailEmpDetails) {
			System.out.println(employee);
		}
		for(String employee:outlookEmpDetails) {
			System.out.println(employee);
		}
		for(String employee:othersEmpDetails) {
			System.out.println(employee);
		}
		scan.close();
	}

}
