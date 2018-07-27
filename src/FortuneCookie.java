import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
	FortuneCookie fc = new FortuneCookie();
	fc.showButton();
	
}

public void showButton() {
    System.out.println("Button clicked");
    JFrame frame= new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton button = new JButton("You will get a fortune");
	frame.add(button);
	button.addActionListener(this);
  frame.pack();
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo");
int rand = new Random().nextInt(5);
	
	if (rand==0) {
		JOptionPane.showMessageDialog(null,"You will win the lottery");
	}
	
	else if (rand==1) {
		JOptionPane.showMessageDialog(null,"You will get lucky very soon");
	}
	
	else if (rand==2) {
		JOptionPane.showMessageDialog(null,"You will get an amazing prize");
	}
	
	else if (rand==3) {
		
		JOptionPane.showMessageDialog(null,"You will have a very nice vacation");
		
	}
	
	else if (rand==4) {
		JOptionPane.showMessageDialog(null,"You will live a long life ");
	}
}
}