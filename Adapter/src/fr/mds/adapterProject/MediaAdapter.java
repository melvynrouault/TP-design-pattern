package fr.mds.adapterProject;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer AMP;
	
	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			AMP = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			AMP = new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equalsIgnoreCase("vlc")) {
			AMP.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			AMP.playMp4(fileName);
		}
	}
	
	
}
