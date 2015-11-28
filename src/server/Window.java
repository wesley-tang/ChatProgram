package server;

import javax.swing.JFrame;

public class Window {

public static void main(String[] args){
		
		JFrame window = new JFrame("Chat Server");				// jframe widow
		
		window.setContentPane(new ServerGUI());						// Content of window
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		window.setResizable(false);								// un-expandable
		window.pack();
		window.setVisible(true);				
	}
}
