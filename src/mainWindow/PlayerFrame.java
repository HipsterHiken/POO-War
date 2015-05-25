package mainWindow;

import java.awt.*;

import javax.swing.*;

public class PlayerFrame extends JFrame{
	public PlayerFrame(){
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int sl=screenSize.width;
		int sa=screenSize.height;
		setBounds(sl/2-250,sa/2-150,400,200);
		
		PlayerSelection ps = new PlayerSelection(this);
		this.getContentPane().add(ps);
		ps.setLayout(null);
	}
}
