import java.util.ArrayList;
import java.util.Random;

public class MyClass4 {
	public int dal() {
		Random rnd = new Random();
		int a = rnd.nextInt(89) + 10;
		return a;
	}
	
	public int[] the() {
		Random rnd = new Random();
		int [] nums = new int [2];
		nums[0] = rnd.nextInt(89) + 10;
		nums[1] = rnd.nextInt(89) + 10;
		return nums;
	}
	
	public ArrayList<Integer> teh() {
		Random rnd = new Random();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(rnd.nextInt(89) + 10);
		nums.add(rnd.nextInt(89) + 10);
		return nums;
	}
	
	//매개 변수로 두개를 받아서 더하기 값을 전달 하는 매소드
	// 매소드 이름은 그대로 thehagi사용
	// 메인 메소드에서
	// 위에 만든 랜덤 숫자를 2개를 전달 매소드를 활용
	// 메인 메소드에서 thehagi의 결과만 출력 해보자
	// rnd2NumList() 메소드를 호출하고
	// 받은 데이터를 thehagi() 넣고 thehagi() 에서 결과값을 외부로 전달해서
	// 화면에 결과값만 출력
	public int thehagi(int num1, int num2) {
		return num1 + num2;
	}
}
