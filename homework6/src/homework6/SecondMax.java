package homework6;

import java.util.Scanner;
public class SecondMax {
	public void Sec(){
		int[] numbers = new int[11];  // �Էµ� ���� �� �迭		
		int[] max = new int[11];	// ���Ͽ� ū ���� ���ʴ�� �� �迭
		Scanner input = new Scanner(System.in);
		System.out.println("10���� ���ڸ� �Է¹޾� �迭�� �����ϰ�\n"
				+ "�ι�°�� ū ���� ����϶�\n"
				+ "==========================================");
		
		for(int i=0; i<10; i++){  // 10���� ���� �Է¹޾� numbers[], max[] �迭�� ������� ���� �ֽ��ϴ�
			System.out.print((i+1)+"��° ���� �Է��Ͻÿ� : ");
			int in = input.nextInt();		
			numbers[i] = in;	max[i] = in;
		}		// numbers[], max[]�� �Էµ� ���� ������� ���ϴ�
		
		int temp=0;	// �� ����
		for(int i=0; i<10; i++){		// ù��° ������ ��~ ���մϴ�
			for(int j=i+1; j<10; j++){	// i ������ ���� ���ؼ� ū���� ������ �����ϴ�
				if( max[i] < max[j]){
					temp = max[i];
					max[i] = max[j];
					max[j] = temp;
				}						// max[]�� ū������ ���ʴ�� ���ϴ�
			}
		}
		
		int index = 0; 
		for(int i=0; i<10; i++){	// �Էµ� ��  numbers[] �߿���  
			if( numbers[i] == max[1]){	// max[1] = �ι�° ū ���� ����ִ� �ڸ��� ã���ϴ�
				index = i;			// �ԷµȰ� numbers[]���� �ƽ�[i]�� ���� ����
			}						// ���° �� ���� �˾Ƴ��ϴ� (2���� ū���� ���° �Էµ� ������ �˾Ƴ��ϴ�)
		}
		
		
		System.out.println("�ι�°�� ū ���� "+(index+1)+"��°�� "+max[1]+"�Դϴ�.");				
				// �ι�°�� ū ���� max[1] => max�� ū ������ ���ʴ�� ���� �����Դϴ�
				// �ι�°�� ū ���� numbers�迭(�ԷµȰ�)�� ��ġ�� =>  index + 1 �Դϴ�. (�迭�� 0���� ����)
	}

}
