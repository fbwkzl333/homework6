// 1. Main�Լ����� Ŭ���� : ExamVariousArray

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
				+ "�迭 ����ϱ�\n"
				+ "*******************\n"
				+ "1. �ι�°�� ū �� ã��\n"
				+ "2. �ɻ� ���� ���\n"
				+ "3. �л� ����, ��հ� ���ϱ�\n"
				+ "4. 5�� ����Ʈ�� ������ ���� ���ϱ�\n"
				+ "5. ��ġ�� �ʴ� ���� 10�� �Է¹ޱ�\n"
				+ "6. �����ϱ�\n"
				+ "���ϴ� �޴���>> ");  // ���� ���
		int num = s.nextInt(); 		// num�� int������ �Է¹���
		
		switch(num){ // num�� ���� ( �Էµ� ��ȣ -> �ش� Ŭ���� ȣ��)
		case 1:  //num = 1(. ���簢�� ����� )
			SecondMax num1 = new SecondMax();  // 1�� Ŭ���� �ν��Ͻ� ����
			num1.Sec();  // 1�� Ŭ���� ȣ��, ��ȯ
			break;
		case 6:
			System.out.println("Goodbye Thank you !");
			break;
		}
		
	}

}
