

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;

import javax.swing.JEditorPane;

public class urlExample {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					urlExample window = new urlExample();
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
	public urlExample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 579, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Browser b=new Browser();
		try {
			
			JEditorPane editorPane = new JEditorPane();
			frame.getContentPane().add(editorPane, BorderLayout.NORTH);
			editorPane.setPage("http://www.google.com");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
