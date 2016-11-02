// 5번메뉴 클래스 :OnlyNumber (배열)

package homework6;

import java.util.Scanner;

public class OnlyNumber {
	public void Onl(){
		Scanner input = new Scanner(System.in);
		int[] su = new int[11];
		System.out.println("==========================================\n"
				+ "1~100 사이의 숫자를 입력하세요");
		
		
		for(int i=1; i<=10; i++){
			boolean bDash=true;
			
			while(bDash)		// 입력된 값이 죽복이 안되게 검사합니다
			{
				System.out.print(i+" 번째 숫자: ");
				int num=input.nextInt();	// 입력된 값을 num에 넣습니다
				su[i] = num;				// 배열에도 넣습니다
				bDash= false;				// 들어갔으면 와일문을 펄스로 나갈준비를 합니다
				for(int j=0;j<i;j++){	// su배열을 한번 돌아봅니다 입력한 i까지
					if(su[j] == num){	// su배열에 입력한 값이 있으면 와일문을 트루로! 다시한번 돕니다
						bDash=true;
						System.out.println("잘못 입력하였습니다. 다시 입력하세요");	//다시하세요
						break;	//와일문 끝냄. 이 문장에 온다면 bDash는 트루 이기때문에 또돔
					}
				}
			}
		}
		for(int i=10; i>0; i--){	// 입력된 값 su[] 를 거꾸로 돌면서 출력합니다
				System.out.println(i+" 번째 숫자는 "+su[i]+"입니다.");
		}
	}

}
