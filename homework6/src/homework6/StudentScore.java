// 3번메뉴 클래스 : StudentScore(2차원 배열)
package homework6;

import java.util.Scanner;
public class StudentScore {
	public void Stu(){
		Scanner input = new Scanner(System.in);
		int[][] stu = new int[5][3];	// 학생 5명의 3과목 배열
		System.out.println("==========================================");
		for(int i=0; i<stu.length; i++){
			System.out.print((i+1)+"번 학생 국어, 영어, 수학: ");
			stu[i][0] = input.nextInt();	// i번쨰 학생의 국어점수 입력
			stu[i][1] = input.nextInt();	// i번째 학생의 영어점수 입력
			stu[i][2] = input.nextInt();	// i번째 학생의 수학점수 입력
		}
		
		int Ksum = 0, Esum = 0, Msum = 0;
		double Kavg = 0, Eavg=0, Mavg=0;
		for(int i=0; i<stu.length; i++){	// 각 과목의 총점, 평균
			Ksum += stu[i][0]; 	// 국어 총점
			Kavg = Ksum/(double)stu.length;	// 국어 평균
			Kavg = Kavg*10+0.5f; Kavg = (int)Kavg / 10d;// 반올림
			
			Esum += stu[i][1]; 	// 영어 총점
			Eavg = Esum/(double)stu.length;	// 영어 평균
			Eavg = Eavg*10+0.5f; Eavg = (int)Eavg / 10d;// 반올림
			
			Msum += stu[i][2]; 	// 수학 총점
			Mavg = Msum/(double)stu.length;	// 수학 평균
			Mavg = Mavg*10+0.5f; Mavg = (int)Mavg / 10d;// 반올림
		}
		
		int stu1=0, stu2=0, stu3=0, stu4=0, stu5=0;
		double stu1avg=0, stu2avg=0, stu3avg=0, stu4avg=0, stu5avg=0;
		for(int i=0; i<stu.length; i++){	// 각 학생의 총점, 평균
			for(int j=0; j<stu[i].length; j++){ // i 번째학생의 j과목들
				switch(i){
				case 0:		// 1번 학생의 총점, 평균
				stu1 += stu[i][j];	// 총점
				stu1avg = stu1/(double)stu[i].length;	// 평균	
				stu1avg = stu1avg*10+0.5f; // 반올림
				stu1avg = (int)stu1avg / 10d;
				break;
				
				case 1:		// 2번 학생의 총점, 평균
					stu2 += stu[i][j];	// 총점
					stu2avg = stu2/(double)stu[i].length;	// 평균
					stu2avg = stu2avg*10+0.5f; // 반올림
					stu2avg = (int)stu2avg / 10d;
					break;
					
				case 2:		// 3번 학생의 총점, 평균
					stu3 += stu[i][j];	// 총점
					stu3avg = stu3/(double)stu[i].length;	// 평균
					stu3avg = stu3avg*10+0.5f; // 반올림
					stu3avg = (int)stu3avg / 10d;
					break;
					
				case 3:		// 4번 학생의 총점, 평균
					stu4 += stu[i][j];	// 총점
					stu4avg = stu4/(double)stu[i].length;	// 평균
					stu4avg = stu4avg*10+0.5f; // 반올림
					stu4avg = (int)stu4avg / 10d;
					break;
					
				case 4:		// 5번 학생의 총점, 평균
					stu5 += stu[i][j];	// 총점
					stu5avg = stu5/(double)stu[i].length;	// 평균
					stu5avg = stu5avg*10+0.5f; // 반올림
					stu5avg = (int)stu5avg / 10d;
					break;
				}
			}
		}
		
		
		System.out.println("국어총점은 "+Ksum+"이고, 평균은 "+Kavg+" 입니다.");
		System.out.println("영어총점은 "+Esum+"이고, 평균은 "+Eavg+" 입니다.");
		System.out.println("수학총점은 "+Msum+"이고, 평균은 "+Mavg+" 입니다.");
		System.out.println("1 번 학생의 총점은 "+stu1+"이고, 평균은 "+stu1avg+" 입니다.");
		System.out.println("2 번 학생의 총점은 "+stu2+"이고, 평균은 "+stu2avg+" 입니다.");
		System.out.println("3 번 학생의 총점은 "+stu3+"이고, 평균은 "+stu3avg+" 입니다.");
		System.out.println("4 번 학생의 총점은 "+stu4+"이고, 평균은 "+stu4avg+" 입니다.");
		System.out.println("5 번 학생의 총점은 "+stu5+"이고, 평균은 "+stu5avg+" 입니다.");
	}

}
