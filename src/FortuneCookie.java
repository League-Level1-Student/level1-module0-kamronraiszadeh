import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
	FortuneCookie fc = new FortuneCookie();
	fc.showButton();
	
}

public void showButton() {
    System.out.println("Button clicked");
    JFrame frame= new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	button.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}