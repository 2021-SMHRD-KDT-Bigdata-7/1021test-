package java1021team;

import java.util.Scanner;

import Music.Music;

public class MusicPlayer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MusicController mc = new MusicController();
		
		System.out.println("====�����÷��̾�====");
		
		while(true) {
			System.out.print("1.��� 2.��� 3.���� 4.������ 5.������ 6.���� >> ");
			int a = sc.nextInt();
			
			if (a == 1) {
				System.out.println("====���====");
				
				System.out.print("���� : ");
				String title = sc.next();
				
				System.out.print("���� : ");
				String singer = sc.next();
				
				System.out.print("�ð� : ");
				int playTime = sc.nextInt();
				
				
			}else if (a == 2) {
				
			}else if (a == 3) {
				MusicVO mv = mc.play();
				mc.print(mv);
			}else if (a == 4) {
				MusicVO mv = mc.pre();
				mc.print(mv);
			}else if (a == 5) {
				MusicVO mv = mc.next();
				mc.print(mv);
			}else if (a == 6) {
				System.out.println("�÷��̾ �����մϴ�.");
				break;
			}else {
				System.out.println("��Ȯ�� ���ڸ� �Է��ϻ��ּ���.");
			}
		}

	}

}
