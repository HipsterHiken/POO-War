package mainWindow;

import java.awt.*;
import java.io.*;

import javax.swing.*;
import javax.imageio.*;

public class mapPanel extends JPanel{
	Image i;

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		try {
			i=ImageIO.read(new File("mapa.png"));
		}
	    catch(IOException e) {
	    	System.out.println(e.getMessage());
			System.exit(1);
	    }
		
		g.drawImage(i,0,0,null);
	}
}
