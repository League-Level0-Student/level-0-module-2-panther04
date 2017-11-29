package random;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class lottery {
public static void main(String[] args) {
	Random hi = new Random();
for (int i = 0; i < 6; i++) { 
	int a = hi .nextInt(75);

	System.out.println(a);
}

}




}