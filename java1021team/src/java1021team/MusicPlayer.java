package java1021team;

import java.util.Scanner;

import Music.Music;

public class MusicPlayer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MusicController mc = new MusicController();
		
		System.out.println("====뮤직플레이어====");
		
		while(true) {
			System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >> ");
			int a = sc.nextInt();
			
			if (a == 1) {
				System.out.println("====등록====");
				
				System.out.print("제목 : ");
				String title = sc.next();
				
				System.out.print("가수 : ");
				String singer = sc.next();
				
				System.out.print("시간 : ");
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
				System.out.println("플레이어를 종료합니다.");
				break;
			}else {
				System.out.println("정확한 숫자를 입력하새주세요.");
			}
		}

	}

}
