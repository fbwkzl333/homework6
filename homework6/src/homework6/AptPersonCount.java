// 4번메뉴 클래스 :AptPersonCount (배열)

package homework6;

import java.util.Scanner;

public class AptPersonCount {
	public void Apt(){
		int F1[] = new int[3]; // 1층의 101~103호
		int F2[] = new int[3]; 
		int F3[] = new int[3];
		int F4[] = new int[3];
		int F5[] = new int[3];
		int sum1 =0, sum2 =0, sum3=0, sum4=0, sum5=0;	// 층마다 살고 있는 사람 수의 합
		Scanner input = new Scanner(System.in);
		System.out.println("==========================================");
			for(int i=0; i<F1.length; i++){
				System.out.print("101호에 살고 있는 사람의 숫자 : ");
				F1[i] = input.nextInt();
				sum1 += F1[i];
			}
			for(int i=0; i<F2.length; i++){
				System.out.print("102호에 살고 있는 사람의 숫자 : ");
				F2[i] = input.nextInt();
				sum2 += F2[i];
			}
			for(int i=0; i<F3.length; i++){
				System.out.print("103호에 살고 있는 사람의 숫자 : ");
				F3[i] = input.nextInt();
				sum3 += F3[i];
			}
			for(int i=0; i<F4.length; i++){
				System.out.print("104호에 살고 있는 사람의 숫자 : ");
				F4[i] = input.nextInt();
				sum4 += F4[i];
			}
			for(int i=0; i<F5.length; i++){
				System.out.print("105호에 살고 있는 사람의 숫자 : ");
				F5[i] = input.nextInt();
				sum5 += F5[i];
			}
			int allsum = sum1+sum2+sum3+sum4+sum5;	// 1~5층 거주자 총합
			
		
		
		System.out.println("이 아파트의 거주자는 모두 "+allsum+"명 입니다.");
		System.out.println("1층에 사는 거주자는 모두 "+sum1+"명 입니다.");
		System.out.println("2층에 사는 거주자는 모두 "+sum2+"명 입니다.");
		System.out.println("3층에 사는 거주자는 모두 "+sum3+"명 입니다.");
		System.out.println("4층에 사는 거주자는 모두 "+sum4+"명 입니다.");
		System.out.println("5층에 사는 거주자는 모두 "+sum5+"명 입니다.");
		
		for(int i=0; i<3; i++){		// F1~5층 배열의 각 i층 거주자를 구합니다
			System.out.println((i+1)+"호 라인에 사는 거주자는 모두 "
					+(F1[i] + F2[i] + F3[i] + F4[i] + F5[i])+"명");
		}
	}
}
