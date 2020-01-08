package fr.mds.adapterProject;

public class AudioPlayer implements MediaPlayer{
	
	MediaAdapter MediadAdapter;
	
	@Override
	public void play(String audioType, String fileName) {

		// inbuilt support to play mp3 music files
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Joue le titre : " + fileName + " (format mp3)");
		}

		// mediaAdapter is providing support to play other file formats
		else if (audioType.equalsIgnoreCase("vlc")
				|| audioType.equalsIgnoreCase("mp4")) {
			MediadAdapter = new MediaAdapter(audioType);
			MediadAdapter.play(audioType, fileName);
		}

		else {
			System.out.println("Le format " + audioType
					+ " n'est pas supporté");
		}
	}
	
}
