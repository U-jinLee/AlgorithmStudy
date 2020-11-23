package Array;
import java.util.*;
/*난수를 이용한 키의 최댓값 구하기*/
public class MaxOfArray {
	static int maxOf(int [] a) {
		int max = a[0];
		for(int i=1 ; i<a.length; i++) {
			if(a[i]> max ) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("키의 최대값을 구합니다.");
		System.out.println("사람 수:");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println((i+1)+"번 째 사람의 키 입력:");
			height[i]= 150 + r.nextInt(50);
			System.out.println(height[i]);
		}
		
		System.out.println("최댓값은"+maxOf(height)+"입니다.");
	}

}