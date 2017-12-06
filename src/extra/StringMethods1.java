//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class StringMethods1 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
String yelnats = "YOU WILL DIE!!!!!!!!Not know but soon Don't panick you have a lot more to go";
// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt

System.out.println(yelnats.charAt(3));
		
		// 3. Print the length of your String to the console.
		//    HINT: .length
System.out.println(yelnats.length());

		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loop
for (int i = 0; i < yelnats.length(); i++) {
	System.out.println(yelnats.charAt(i));
}

		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
String stanley = JOptionPane.showInputDialog("enter a charater");
char nj=stanley.charAt(0);
for (int i = 0; i < yelnats.length(); i++) {
	nj = yelnats.charAt(0);
}
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}



