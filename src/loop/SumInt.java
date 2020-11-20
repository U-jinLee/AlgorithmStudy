package loop;
import java.util.*;

public class SumInt {
	
	public static int Sum(int a) {
		int sum = 0;
		int b = a;
		
		for(int i = 0; i<=b; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1에서 n까지 수를 더합니다. 원하는 n의 수를 입력하세요");
		int n = sc.nextInt();
		
		System.out.println("1에서 "+n+"까지 더한 수의 합은:"+Sum(n)+"입니다.");
	}

}
