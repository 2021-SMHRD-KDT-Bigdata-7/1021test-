package java1021team;

import java.util.ArrayList;
<<<<<<< HEAD
=======

public class MusicController {
>>>>>>> branch 'master' of https://github.com/2021-SMHRD-KDT-Bigdata-7/1021test-.git

<<<<<<< HEAD
public class MusicController {
	
	ArrayList<MusicVO> musiclist = new ArrayList<>();

	   int index = 0;    
	       //�뷡 ������ ����Ҽ� �ִ� �޼ҵ�
	   public void print(MusicVO m) {
	            System.out.println(m.getTitle() + ", " + m.getSinger() + ", "
	                  +m.getPlayTime());
	   }
	           // ���� �޼ҵ�
	   public MusicVO play() {
	      return musiclist.get(index);
	   }
	   // ������ ���
	   public MusicVO pre() {
	      if (index > 0) {
	         index--;
	      } else {
	         index = musiclist.size() - 1;

	      }
	      return musiclist.get(index);
	   }
	   // ������ ���
	   public MusicVO next() {
	      if (index < musiclist.size() - 1) {
	         index++;
	      } else {
	         index = 0;
	      }
	      return musiclist.get(index);
	   }
=======
	ArrayList<MusicVO> musiclist = new ArrayList<>();

	int index = 0;

	
	
	          
	    //�뷡 ������ ����Ҽ� �ִ� �޼ҵ�
	public void print(MusicVO m) {
	         System.out.println(m.getSongName() + ", " + m.getSinger() + ", "
	               +m.getPlayTime());

	// ���� �޼ҵ�
	public MusicVO play() {
		return musiclist.get(index);
	}

	// ������ ���
	public MusicVO pre() {
		if (index > 0) {
			index--;
		} else {
			index = musiclist.size() - 1;

		}
		return musiclist.get(index);

	}

	// ������ ���
	public MusicVO next() {
		if (index < musiclist.size() - 1) {
			index++;
		} else {
			index = 0;
		}
		return musiclist.get(index);
	}

>>>>>>> branch 'master' of https://github.com/2021-SMHRD-KDT-Bigdata-7/1021test-.git
}
