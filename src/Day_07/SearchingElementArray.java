package Day_07;

public class SearchingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {10,20,30,40,50};
		int Search_element = 30;
		boolean status = false;
		
		// USING FOR LOOP
		//-------------------------------------------------------------------------------
//		for(int i=0;i<num.length;i++) {
//			if(num[i]==Search_element) {
//				System.out.println("Search element is present");
//				status=true;
//				break;
//			}	
//		}
		
		// USING ENHANCED FOR LOOP
		//--------------------------------------------------------------------------------
		
		for(int number:num) {
			if(number == Search_element) {
				System.out.println("Element is  found");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("Element not found");
		}
	}

}
