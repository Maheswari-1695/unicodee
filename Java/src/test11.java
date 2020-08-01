import java.util.Arrays;

public class test11 {
	public static void main(String[] args) {
		int a[][]=new int[6][6];

		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[0][3]=40;
		a[0][4]=50;
		a[0][5]=60;
		 
		a[1][0]=10;
		a[1][1]=20;
		a[1][2]=30;
		a[1][3]=40;
		a[1][4]=50;
		a[1][5]=60;

		 
		a[2][0]=10;
		a[2][1]=20;
		a[2][2]=30;
		a[2][3]=40;
		a[2][4]=50;
		a[2][5]=60;
		 
		a[3][0]=10;
		a[3][1]=20;
		a[3][2]=30;
		a[3][3]=40;
		a[3][4]=50;
		a[3][5]=60;
		 
		a[4][0]=10;
		a[4][1]=20;
		a[4][2]=30;
		a[4][3]=40;
		a[4][4]=50;
		a[4][5]=60;
		
		 
		a[5][0]=10;
		a[5][1]=20;
		a[5][2]=30;
		a[5][3]=40;
		a[5][4]=50;
		a[5][5]=60;
		 
		
		int length=a.length;
		System.out.println(length);
	   System.out.println("normal for===");	
	   for(int i=0;i<a.length;i++) {
		   for(int j=0;j<a[i].length;j++)
		   System.out.println(a[i][j]+ "   ");
	   }
	   
	   System.out.println("enhanced for====");
	   for (int x[]:a) {
		   for(int v:x) {
		   System.out.println(v + "  ");
	   }
	   System.out.println();
	   
	   }
	}
}
	
