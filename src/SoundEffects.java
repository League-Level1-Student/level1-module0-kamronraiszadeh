import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener{
public static void main(String[] args) {
	SoundEffects sound=new SoundEffects();
	sound.start();
}
void start() {
	System.out.println("Button clicked");
    JFrame frame= new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton button = new JButton("Sound");
    JPanel panel= new JPanel();
    panel.add(button);
    frame.add(panel);
	button.addActionListener(this);
  frame.pack();



}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}}
