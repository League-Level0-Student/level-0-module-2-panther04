package extra;

import java.util.Random;

public class mod2cp {
public static void main(String[] args) {
	Random Max = new Random();
	
	int a = Max  .nextInt(1000);
	System.out.println(a);
	
	
	int m = Max .nextInt(900);
	System.out.println(m);
	
	System.out.println(a+m);
	

	System.out.println(a-m);
}
}
