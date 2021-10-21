package java1021team;

import java.util.ArrayList;

public class MusicController {
	
	ArrayList<MusicVO> musiclist = new ArrayList<>();

	   int index = 0;    
	       //노래 정보를 출력할수 있는 메소드
	   public void print(MusicVO m) {
	            System.out.println(m.getTitle() + ", " + m.getSinger() + ", "
	                  +m.getPlayTime());
	   }
	           // 실행 메소드
	   public MusicVO play() {
	      return musiclist.get(index);
	   }
	   // 이전곡 재생
	   public MusicVO pre() {
	      if (index > 0) {
	         index--;
	      } else {
	         index = musiclist.size() - 1;

	      }
	      return musiclist.get(index);
	   }
	   // 다음곡 재생
	   public MusicVO next() {
	      if (index < musiclist.size() - 1) {
	         index++;
	      } else {
	         index = 0;
	      }
	      return musiclist.get(index);
	   }
}
