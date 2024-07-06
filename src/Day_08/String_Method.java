package Day_08;

import java.util.Arrays;

public class String_Method {

	public static void main(String[] args) {
		
		// Declaring string Approach 1
//		String s= "welcome";
//		System.out.println(s);
		
		// Approach 2
		
//		String s = new String("Welcome");
//		System.out.println(s);
//		
		// to find the length of string
		
		String s= "welcome";
		System.out.println(s.length()); //7
		System.out.println("welcome".length());//7
		
		// Concatenation of string
		
		String s1 = "Welcome";
		String s2 = "to java";
		String s3 = "students";
		System.out.println(s1+" "+s2); // welcome to java
		System.out.println(s1.concat(" "+s2)); //Welcome to java
		System.out.println(s1+s2+" "+s3);
		System.out.println(s1.concat(s2).concat(" "+s3));
		
		// trim() : Removes the right and left side of the string
		String s4 ="   Welcome   ";
		System.out.println(s4.length());  // before trimming 13 char
		System.out.println(s4.trim());
		System.out.println(s4.trim().length());
		
		// charAt(): returns the character of string specified index
		
		String s5 = "welcome";
		System.out.println(s5.charAt(3));
		
		// contains(): check the particular string is part of the Main string
		// It returns only boolean value
		
		String s6 = "welcome";
		System.out.println(s6.contains("lc")); //true
		System.out.println(s6.contains("welme")); //false
		
		
		//equals(),   equalIgnoreCase() returns boolean value
		String s7 = "welcome";
		String s8 = "welcome";
		System.out.println(s7==s8); //true
		System.out.println(s7.equals(s8)); //true
		System.out.println(s7.equals("Welcome")); //false W is capital letter
		System.out.println(s7.equalsIgnoreCase("Welcome")); //true
		
		//replace() : it is used to replace single/multiple characters of string
		String s9 = "welcome to selenium java selenium python selenium c#";
		System.out.println(s9.replace('e', 'x'));
		System.out.println(s9.replace("selenium","copywright"));
		
		// Substring(): Extract the part of the string to main string
		
		String a = "welcome";
		System.out.println(a.substring(0,3));
		
		// toUpperCase():convert into upper case
		// toLowerCase():convert in to lower case
		
		String a1 = "welcome";
		String a2 = "WELCOME";
		System.out.println(a1.toUpperCase());
		System.out.println(a2.toLowerCase());
		
		
		// split() : split the string in to multiple parts based on delimeter
		
		String a3 = "abc@gmail.com";
		String a4[]=a3.split("@");
		System.out.println(Arrays.toString(a4));
		System.out.println(a4[0]);
		System.out.println(a4[1]);
		
		
		String b = "abc,123@xyz";
		String b1[]=b.split(",");
		System.out.println(Arrays.toString(b1));
		String b2[]=b1[1].split("@");
		System.out.println(Arrays.toString(b2));
		System.out.println(b1[0]);
		System.out.println(b2[0]);
		System.out.println(b2[1]);
		
		
		String c = "Jhon Kendy";
		System.out.println(c.replace('J','j').contains("jhon"));
		System.out.println(c.toLowerCase().contains("jhon"));
		
		}

}
