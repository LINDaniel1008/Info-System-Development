import javax.swing.*;
import java.awt.FlowLayout;
public class GUIFrames300
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		JFrame myFrame = new JFrame("My 1st Frame");
		myFrame.setSize(300,150); // (wide, high)
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // The x will not only close the window but also make it terminate
		
		
		JLabel myLabel1 = new JLabel("Hello there!");
		JLabel myLabel2 = new JLabel("Nice to meet you!");
		
		myFrame.setLayout(new FlowLayout()); // Requires importing the FlowLayout, the FlowLayout method will place one message follow the previous message by default
		
		myFrame.add(myLabel1);
		myFrame.add(myLabel2); // The 2nd label overlays the 1st label
	}

}
