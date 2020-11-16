import java.util.Scanner;

public class Test {
	static int FourMaxInt (int a, int b, int c, int d) {
		//네 값의 최댓값을 구하는 메서드를 작성하시오
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		
		return max;
	}
	static int MinInt (int a, int b, int c) {
		//세 값의 최솟값을 구하는 메서드를 작성하시오
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		
		return min;
	}
	
	static int FourMinInt (int a, int b, int c, int d) {
		//네 값의 최솟값을 구하는 메서드를 작성하시오
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		
		if(d < min) {
			min = d;
		}
		
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		System.out.println("정숫값 네 개를 각각 띄어쓰기로 입력하세요");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		d= sc.nextInt();
		
		System.out.println(a+", "+b+", "+c+", "+d+" 네 값중  가장 큰 수는 "+FourMaxInt(a,b,c,d)+"입니다.");
		System.out.println(a+", "+b+", "+c+" 세 값중  가장 작은 수는 "+MinInt(a,b,c)+"입니다.");
		System.out.println(a+", "+b+", "+c+", "+d+" 네 값중  가장 작은 수는 "+FourMinInt(a,b,c,d)+"입니다.");
	}

}