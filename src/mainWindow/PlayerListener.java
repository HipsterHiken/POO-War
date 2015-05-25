package mainWindow;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class PlayerListener implements MouseListener{
	JButton c;
	
	public PlayerListener(JButton x){
		c=x;
	}
	
	public void mouseClicked(MouseEvent e) {
		if(c.getText() == "3" || c.getText() == "4" || 
		   c.getText() == "5" || c.getText() == "6"){
		
		}
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e){
		
	}
}
