package programming;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Week2DiscussionP2 {
	
	public static void CreateFrameWithPanel() {
		JFrame baseFrame = new JFrame("Frame Title");
		baseFrame.setSize(200, 400);
		baseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel basePanel = new JPanel();
		baseFrame.add(basePanel);
	}
}
