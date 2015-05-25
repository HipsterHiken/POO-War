package mainWindow;

import java.awt.*;
import java.util.*;
import javax.swing.*;


public class mapFrame extends JFrame{
	public final int LARG_DEFAULT=1000;
	public final int ALT_DEFAULT=706;
	
	public String[] playerNames;
	public Color[] playerColors;
	
	JLabel[] playernames = new JLabel[6];
	int[] index;
	mapPanel p;
	
	
	public mapFrame() {
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int sl=screenSize.width;
		int sa=screenSize.height;
		int x=sl/2-LARG_DEFAULT/2;
		int y=sa/2-ALT_DEFAULT/2;
		setBounds(x,y,screenSize.width-10,screenSize.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setTitle("War Game");
		p = new mapPanel();
		p.addMouseListener(new TerritoryClick(p));
		this.getContentPane().add(p);
	}
	
	public void drawPlayers(String[] playerNames,Color[] playerColors){
		int i;
		this.playerNames = playerNames;
		this.playerColors = playerColors;
		Dimension size;
		int iter = 450;
		index = new int[playerNames.length];
		ArrayList<Integer> shuffle = new ArrayList<Integer>();
		
		for(i = 0;i <playerNames.length;i++){
			shuffle.add(i);
		}
		
		Random rnd = new Random();
		
		int length = playerNames.length;
		
		for(i = 0;i < playerNames.length;i++){
			int current = rnd.nextInt(length);
			index[i] = shuffle.get(current);
			shuffle.remove(current);
			length--;
		}
		
		for(i = 0;i < playerNames.length;i++){
			JLabel player = new JLabel(playerNames[index[i]]);
			player.setOpaque(true);
			if(playerColors[index[i]] == Color.BLACK){
				player.setForeground(Color.WHITE);
			}
			player.setBackground(playerColors[index[i]]);
			Insets in = this.getInsets();
			size = player.getPreferredSize();
			player.setBounds(iter+in.left,10+in.top, size.width, size.height);
			p.add(player);
			playernames[index[i]] = player;
			iter += (size.width+5);
		}
		
		this.getContentPane().repaint();
		p.repaint();
		
	}

}
