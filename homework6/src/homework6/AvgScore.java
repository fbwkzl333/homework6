// 2번메뉴 클래스 :AvgScore

package homework6;

import java.util.Scanner;
public class AvgScore {
	public void Avg(){
		Scanner input = new Scanner(System.in);
		double su[] = new double[11];		// 심사점수가 들어갈 배열
		
		
		System.out.println("==========================================");
		for(int i=0; i<10; i++){
		System.out.print((i+1)+"번 심사점수 입력: ");
		su[i] = input.nextDouble();
		}
		
		double temp =0;	// 빈공간
		for(int i=0; i<10; i++){		// 첫밴째 수부터 쭉~ 비교합니다
			for(int j=i+1; j<10; j++){	// i 다음번 수와 비교해서 큰수를 앞으로 보냅니다
				if( su[i] < su[j]){
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				}						// su[]는 큰수부터 차례대로 들어갑니다
			}
		}
		
		double sum=0;	// 총합이 들어감 
		for(int i=1; i<9; i++){	// su[]의 2번째부터 9번째 수까지
			sum = sum + su[i];	// sum 에 더합니다
		}
		double avg = sum/8;		// 더한수를 8로 나눕니다 (평균)
		avg = avg*10+0.5f;		// 평균을 *10 한 후, 0.5f를 더합니다 (7.4## -> 74.##, 반올림)
		avg = ( ((int)avg) / 10d );		// 정수형으로 바꾼후 다시 10을 나눕니다 ((int)74 -> (double)7.4)
		System.out.println("가장 큰 점수와 가장 작은 점수를 제외한\n"
				+"8개의 점수 평균은 "+avg+"입니다.");
		// 입력한 수 su[]의 su[1]~su[8]의 평균을 #.#반올림 한 avg 값을 출력합니다.
	}
}
