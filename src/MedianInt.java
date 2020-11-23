import java.util.*;
public class MedianInt {
	
	public static int medianInt(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			} else if(a <= c) {
				return a;
			}else return c;
		}
		else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {			
			return b;
		}
	}

	public static void main(String[] args) {
		System.out.println("세 정숫값을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("첫 번째 정숫값 입력: ");
		a=sc.nextInt();
		System.out.println("두 번째 정숫값 입력: ");
		b=sc.nextInt();
		System.out.println("세 번째 정숫값 입력: ");
		c=sc.nextInt();
		System.out.println("중앙값은 "+medianInt(a, b, c)+"입니다.");
	}

}
