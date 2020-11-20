import java.util.*;
public class JudgeSign {
	public static void JudgeSignMethod(int a) {
		if(a > 0) {
			System.out.println("이 수는 양수입니다.");
		} else if(a < 0) {
			System.out.println("이 수는 음수입니다.");
		} else System.out.println("이 수는 0입니다.");
	}
	
	public static void main(String[] args) {
		//숫자가 양수인지 음수인지 혹은 0인지를 판별하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("판별하고 싶은 숫자를 하나 입력하세요: ");
		int a = sc.nextInt();
		JudgeSignMethod(a);
	}
}
