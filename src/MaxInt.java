import java.util.*;
public class MaxInt {

	public static int maxInt(int a, int b ,int c) {
		int max = a;
		
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정숫값을 입력");
		int a= sc.nextInt();
		System.out.println("두 번째 정숫값을 입력");
		int b= sc.nextInt();
		System.out.println("세 번째 정숫값을 입력");
		int c= sc.nextInt();

		System.out.println(a+", "+b+", "+c+" 세 값중  가장 큰 수는 "+maxInt(a,b,c)+"입니다.");
	}
}