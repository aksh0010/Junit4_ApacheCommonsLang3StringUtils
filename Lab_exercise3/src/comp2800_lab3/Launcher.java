package comp2800_lab3;
import javax.swing.JFrame;
import java.awt.EventQueue;

public class Launcher {

	public static void main(String[] args) {
		// Run this program on the Event Dispatch Thread (EDT)
		EventQueue.invokeLater(new Runnable() {
			//creating instance of mainframe and using show method to set frame to visible
			public void run() {	
				 	
					JFrame frame = new JFrame("Color Chooser");
				   	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			        frame.setSize(400, 300);
			        frame.add(new ColorChooser()); // passing the JPanel
			        frame.setVisible(true);
			        frame.setLocationRelativeTo(null);
		
			}
		});
	}
}