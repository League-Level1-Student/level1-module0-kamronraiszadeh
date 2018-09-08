import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {
public static void main(String[] args) {
	new CutenessTv().showButton();
	}

	public void showButton() {
	    System.out.println("Button clicked");
	    JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		frame.add(panel);
		
	    panel.add(a);
		panel.add(b);
		panel.add(c);
		a.addActionListener(this);
	  
	  b.addActionListener(this);
	 
	  c.addActionListener(this);
	  frame.pack();
		
}
	JButton a = new JButton("duck");
	JButton b = new JButton ("frog") ;
	JButton c = new JButton ("unicorn");

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("h6");
		JButton pressed=(JButton)e.getSource();
		if (pressed==a) {
		showDucks();	
		}
		else if (pressed==b) {
			showFrog();
		}	
		
		else {
			showFluffyUnicorns();
		}
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	 
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}


}

