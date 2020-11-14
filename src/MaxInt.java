import java.util.*;
public class MaxInt {

	public static void main(String[] args) {
		//입력한 3개의 값 중 최댓값을 구하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 세 개를 입력하시오.");
		int a, b, c;
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c; 
		}
		System.out.println("최대값은 "+max+"입니다.");
	}

}