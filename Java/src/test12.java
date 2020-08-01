
public class test12 {
	public static void main(String[] args) {
		int a[][]= new int [2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=10;
		a[1][1]=20;
		a[1][2]=30;
		int length=a.length;
	    System.out.println(length);
		System.out.println("normal for====");
		{
		for (int i =0;i<a.length;i++)
		for(int j=0;j<a[i].length;j++)
		
			System.out.print(a[i][j]+"  ");
		}
		System.out.println();
		
		
		
		System.out.println("enhanced for===");
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+"   ");
			}
			System.out.println();
		}
		}
}
		
		
		
		
	


