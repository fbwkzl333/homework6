// 1. Main함수포함 클래스 : ExamVariousArray

package homework6;

import java.util.Scanner;
public class ExamVariousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReportClass();
	}
	
	public static void ReportClass(){
		Scanner s = new Scanner(System.in);
		System.out.print("*******************\n"
				+ "배열 사용하기\n"
				+ "*******************\n"
				+ "1. 두번째로 큰 수 찾기\n"
				+ "2. 심사 점수 계산\n"
				+ "3. 학생 총점, 평균값 구하기\n"
				+ "4. 5층 아파트의 거주자 숫자 구하기\n"
				+ "5. 겹치지 않는 숫자 10개 입력받기\n"
				+ "6. 종료하기\n"
				+ "원하는 메뉴는>> ");  // 문제 출력
		int num = s.nextInt(); 		// num을 int형으로 입력받음
		
		switch(num){ // num을 비교함 ( 입력된 번호 -> 해당 클래스 호출)
		case 1:  //num = 1( 두번째로 큰 수 구하기 )
			SecondMax num1 = new SecondMax();  // 1번 클래스 인스턴스 생성
			num1.Sec();  // 1번 클래스 호출, 반환
			break;
		case 6:		// 입력된게 6이면 종료
			System.out.println("Goodbye Thank you !");
			break;
		}
		
	}

}
