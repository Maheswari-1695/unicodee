import java.util.LinkedHashMap;
import java.util.Map;

public class Javaa {
	public static void main(String[] args) {
		String s="java worlddd";
		String[]sp=s.split(" ");
		Map<String,Integer>mm=new LinkedHashMap<>();
		for (String r:sp) {
			if(!mm.containsKey(s))
			{mm.put(r, 1);
			
				}
			else {
				mm.put(r,mm.get(s)+1);
			}
			System.out.println(mm);
			}
		int count = 0;
		int n;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("prime no");
				
	
	}

	}}
