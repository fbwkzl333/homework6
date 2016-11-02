// 1번메뉴 클래스 :SecondMax (배열사용)

package homework6;

import java.util.Scanner;
public class SecondMax {
	public void Sec(){
		int[] numbers = new int[11];  // 입력된 수가 들어갈 배열			
		int[] max = new int[11];	// 비교하여 큰 수가 차례대로 들어갈 배열
		Scanner input = new Scanner(System.in);
		System.out.println("10개의 숫자를 입력받아 배열에 저장하고\n"
				+ "두번째로 큰 수를 출력하라\n"
				+ "==========================================");
		
		for(int i=0; i<10; i++){  // 10개의 수를 입력받아 numbers[], max[] 배열에 순서대로 집어 넣습니다
			System.out.print((i+1)+"번째 수를 입력하시오 : ");
			int in = input.nextInt();		
			numbers[i] = in;	max[i] = in;
		}		// numbers[], max[]는 입력된 값이 순서대로 들어갑니다
		
		int temp=0;	// 빈 공간
		for(int i=0; i<10; i++){		// 첫밴째 수부터 쭉~ 비교합니다
			for(int j=i+1; j<10; j++){	// i 다음번 수와 비교해서 큰수를 앞으로 보냅니다
				if( max[i] < max[j]){
					temp = max[i];
					max[i] = max[j];
					max[j] = temp;
				}						// max[]는 큰수부터 차례대로 들어갑니다
			}
		}
		
		int index = 0; 
		for(int i=0; i<10; i++){	// 입력된 값  numbers[] 중에서 
			if( numbers[i] == max[1]){	// max[1] = 두번째 큰 수가 들어있는 자리를 찾습니다
				index = i;			// 입력된값 numbers[]에서 맥스[i]로 보낸 수가
			}					// 몇번째 수 인지 알아냅니다 (2번째 큰 수가 몇번째 입력된 수인지 알아냅니다)
		}
		
		
		System.out.println("두번째로 큰 수는 "+(index+1)+"번째수 "+max[1]+"입니다.");				
		// 두번째로 큰 수는 max[1] => max는 큰 수부터 차례대로 들어갔기 때문입니다
		// 두번째로 큰 수의 numbers배열(입력된값)의 위치는 =>  index + 1 입니다. (배열은 0부터 시작)
	}

}
