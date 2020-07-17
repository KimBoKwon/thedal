import java.util.ArrayList;
import java.util.Scanner;

/*
 * 메인 클래스
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 클래스");
		// 클래스 선언
		MyClass mc = new MyClass();
		mc.bab();
		mc.food();
		mc.nono();
		MyClass2 mc1 = new MyClass2();
		mc1.m1();
		mc1.m2();
		MyClass3 mc2 = new MyClass3();
		int i = mc2.r1();
		System.out.println("r1에서 받은 int 데이터: " + i);
		mc2.r2();
		String s = mc2.r2();
		System.out.println(s + " 보권~");
		
		// 클래스 만들고 매소드를 만들기
		// 더달의 기능을 별도로 만들어서
		// 더하기 출력 해주는 매소드
		// 더하기의 답을 전달 해주는 매소드
		// 메인에서 메소드만 이용해서 출력 또는 
		// 답을 비교
		MyClass4 mc3 = new MyClass4();
		int a = mc3.dal();
		Scanner sc = new Scanner(System.in);
		System.out.println(a + " + " + a + " = ? ");
		System.out.println("두 수의 합은?");
		int hab = sc.nextInt();
		if (a == hab) {
			System.out.println("맞습니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
		
		ArrayList<Integer> list = mc3.teh();
		System.out.println("랜덤의 수의 리스트 갯수 : " + list.size());
		System.out.println("첫번째 수: " + list.get(0));
		System.out.println("두번째 수: " + list.get(1));
		int dab = mc3.thehagi(list.get(0), list.get(1));
		System.out.println(dab);
	}

}
