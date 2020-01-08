package fr.mds.adapterProject;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "Parle à ma main.mp3");
		audioPlayer.play("mp4", "Lonely.mp4");
		audioPlayer.play("vlc", "Allumer le feu.vlc");
		audioPlayer.play("avi", "Loca loca.avi");

		MediaPlayer player = new MediaAdapter("mp4");
		player.play("mp4", "test.mp4");

		MediaPlayer player1 = new AudioPlayer();
		player1.play("mp4", "test1.mp4");
	}
}
