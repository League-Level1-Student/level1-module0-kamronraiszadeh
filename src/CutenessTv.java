import javax.swing.JButton;
import javax.swing.JFrame;

public class CutenessTv {
public static void main(String[] args) {

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
}
}
