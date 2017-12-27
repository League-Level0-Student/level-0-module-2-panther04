package extra;

import javax.swing.JOptionPane;

public class mod2cp2 {
public static void main(String[] args) {
String NO = JOptionPane.showInputDialog("HOW MANY FLOWER CUPS DO YOU HAVE?");
int num = Integer.parseInt(NO);
	
	if (num<2) {
		JOptionPane.showMessageDialog(null,"Go back to the store and get some more Flower right now");
	}

String sure = JOptionPane.showInputDialog("How many people are you giving cookies to?");
num = Integer.parseInt(sure);

	if (num>30) {
		JOptionPane.showMessageDialog(null,"You have to make two batches of cookies");
	}
}
}
