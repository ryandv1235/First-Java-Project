package ryan;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import jaco.mp3.player.MP3Player;

public class AudioPlayer {
	
		
		String filePath;
		MP3Player mp3Player;
		File selectedFile;
		
		public void getFile(JTextField textField) {
			JFileChooser chooser = new JFileChooser();
			chooser.setDialogTitle("Select a music file.");
			chooser.showOpenDialog(null);
			selectedFile = chooser.getSelectedFile();
			filePath = selectedFile.getAbsolutePath();
			if(filePath.endsWith(".mp3")) {
				textField.setText(filePath);
				mp3Player = new MP3Player(new File(textField.getText()));
			}
			else {
				JOptionPane.showMessageDialog(null, "You can only open a mp3 file!");
			}
		}

	
		public void playAudio() {
			mp3Player.play();
		}

		public void pauseAudio() {
			mp3Player.pause();
		}
		
		public void stopAudio() {
			mp3Player.stop();
		}
}
