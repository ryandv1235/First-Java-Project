package ryan;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window {

	private JFrame frame;
	AudioPlayer player = new AudioPlayer();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1010, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		ImageIcon play = new ImageIcon(Window.class.getResource("/play.png"));
		Image getImage1 = play.getImage();
		Image modifyScale1 = getImage1.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		ImageIcon playEdit = new ImageIcon(modifyScale1);
		btnNewButton.setIcon(playEdit);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player.playAudio();
			}
		});
		btnNewButton.setBounds(150, 85, 115, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPause = new JButton("");
		ImageIcon pause = new ImageIcon(Window.class.getResource("/pause.png"));
		Image getImage = pause.getImage();
		Image modifyScale = getImage.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		ImageIcon pauseEdit = new ImageIcon(modifyScale);
		btnPause.setIcon(pauseEdit);
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.pauseAudio();
			}
		});
		btnPause.setBounds(400, 85, 115, 45);
		frame.getContentPane().add(btnPause);
		
		JButton btnNewButton_1_1 = new JButton("stop");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.stopAudio();
			}
		});
		btnNewButton_1_1.setBounds(667, 85, 134, 45);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Select");
		ImageIcon select = new ImageIcon(Window.class.getResource("/select.png"));
		Image getImage11 = select.getImage();
		Image modifyScale11 = getImage11.getScaledInstance(800, 800, java.awt.Image.SCALE_SMOOTH);
		ImageIcon selectEdit = new ImageIcon(modifyScale11);
		btnNewButton_1_1_1.setIcon(selectEdit);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player.getFile(textField);
			}
		});
		btnNewButton_1_1_1.setBounds(619, 342, 182, 116);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(150, 346, 461, 112);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
