package asdasd;

import java.util.Scanner;

public class Example {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int scores[]=null;
		int sum=0;
		int max=0;
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();
			if(select==1) {
				System.out.print("학생 수> ");	
				int stuNum = scan.nextInt();
				scores = new int[stuNum];
				sum=0;
				max=0;
			}else if(select==2) {
				if(scores!=null) {
					for(int i=0; i<scores.length;i++) {
						System.out.print((i+1)+"번 째 학생 점수: ");
						scores[i] = scan.nextInt();
						sum+=scores[i];
						if(scores[i]>max) {
							max=scores[i];
						}
					}	
				}
			}else if(select==3) {
				for(int i=0; i<scores.length;i++) {
					System.out.println((i+1)+"번 째 학생 점수: "+scores[i]);
				}
			}else if(select==4) {
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+((double)sum/scores.length));
			}else if(select==5) {
				System.out.println("프로그램 종료.");
				break;
			}else {
				System.out.println("다시 입력 (1~5번 선택)");
			}
			
		}
	}
}
