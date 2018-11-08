package asdasd;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assss {
	static Scanner scan = new Scanner(System.in);
	static int arr[][];

	public static void main(String[] args) {

		boolean run = true;
		int r1 = 0, c1 = 0, r2 = 0, c2 = 0;
		
		while (run) {
			System.out.print("> ");
			String rc = scan.nextLine();
			StringTokenizer st = new StringTokenizer(rc, " ");
			r1 = Integer.parseInt(st.nextToken());
			c1 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			c2 = Integer.parseInt(st.nextToken());
			if (Math.abs(r1) == Math.abs(c1)) {
				if (Math.abs(r1) <= 5000 && Math.abs(r2) <= 5000 && Math.abs(c1) <= 5000 && Math.abs(c2) <= 5000) {
					if (r2 - r1 >= 0 && r2 - r1 <= 49) {
						if (c2 - c1 >= 0 && c2 - c1 <= 49) {
							break;
						}
					}
				}
			}
			System.out.println("다시 입력");
		}
		arr = new int[Math.abs(r1) * 2 + 1][Math.abs(c1) * 2 + 1];
		int x = arr.length / 2;
		int y = arr[0].length / 2;
		int count = 0;
		int move = 1;
		int num = 1;
		arr[x][y] = num;
		while (arrContains()) {
			if (count == 0) {
				if (y < y + move) {
					for (int i = y; i <= y + move; i++) {
						arr[x][i] = num;
						num++;
					}
				} else if (y > y + move) {
					for (int i = y; i >= y + move; i--) {
						arr[x][i] = num;
						num++;
					}
				}
				y = y + move;
				move = -move;
				count++;
			} else if (count == 1) {
				if (x < x + move) {
					for (int i = x; i <= x + move; i++) {
						arr[i][y] = num;
						num++;
					}
				} else if (x > x + move) {
					for (int i = x; i >= x + move; i--) {
						arr[i][y] = num;
						num++;
					}
				}
				x = x + move;
				if (move < 0) {
					move--;
				} else if (move > 0) {
					if (move < Math.abs(r1) * 2) {
						move++;
					}
				}
				count--;
			}
			num--;
		}
		for (int i = 0; i < r2 - r1 + 1; i++) {
			for (int j = 0; j < c2 - c1 + 1; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static boolean arrContains() { // 배열에 0이 잇는지 없는지 확인!
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}
}
