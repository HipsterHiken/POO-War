package mainWindow;

import java.awt.*;

public class WarManager {
	private static WarManager singleton = new WarManager();
	private mapFrame map;
	
	private WarManager(){
		
	}
	
	public static WarManager getInstance(){
		return singleton;
	}
	
	public void setMap(mapFrame warFrame) {
		
		map = warFrame;
	}
	
	public void drawPlayers(String[] playerNames, Color[] playerColors){
		map.drawPlayers(playerNames, playerColors);
	}
}
