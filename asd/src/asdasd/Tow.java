package asdasd;

import java.util.ArrayList;
import java.util.Scanner;

public class Tow {
static Scanner scna = new Scanner(System.in);
	public static void main(String[] args) {
		int a = scna.nextInt();
		int b = scna.nextInt();
		int c = scna.nextInt();
		int count=0;
		String result = String.valueOf(a*b*c);
		ArrayList<String> str = new ArrayList<>();
		System.out.println(result);
		//String[] str = new String[String.valueOf(result).length()];
		for(int i=0;i<result.length();i++) {
			str.add(result.substring(i, i+1));
		}
		for(int i =0;i<10;i++) {
			for(int j=0;j<str.size();j++) {
				if(str.get(j).equals(String.valueOf(i))) {
					count++;
				}
			}
			System.out.println(i+"의 갯수: "+count);
			count=0;
		}

	}

}
