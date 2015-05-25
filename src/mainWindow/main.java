//Alunos: Hugo Rodrigues Manhaes 1310576
//        Jordan Rodrigues Rangel 1310553
package mainWindow;

import javax.swing.*; 
import java.awt.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mapFrame f=new mapFrame();
		f.setVisible(true);
		
		WarManager war = WarManager.getInstance();
		war.setMap(f);
		
		PlayerFrame pf = new PlayerFrame();
		pf.setVisible(true);
	}

}
