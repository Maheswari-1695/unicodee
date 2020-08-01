package Examples;

public class EvenNumCount {
public static void main(String[] args) {
	int count=0;
	for(int i =1;i<=100;i++) {
		if(i % 2 == 0) {
			count=count+i;
			//count=count+1;
		}
	}
	System.out.println(count);
	
}
}
