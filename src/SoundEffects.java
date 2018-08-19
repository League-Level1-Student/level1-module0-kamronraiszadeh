import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JButton button = new JButton("Sound");
	public static void main(String[] args) {
		SoundEffects sound = new SoundEffects();
		sound.start();
	}

	void start() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.add(button);
		frame.add(panel);
		button.addActionListener(this);
		frame.pack();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed=(JButton) e.getSource();
		
		if (buttonPressed.equals(button)) {
			playSound("old-car-engine_daniel_simion.wav");
		} 
		
		
	}
	private void playSound(String fileName) {
	   AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
}
