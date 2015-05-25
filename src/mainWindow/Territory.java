package mainWindow;

import java.awt.geom.*;

public class Territory {
	
	// propriedade que guarda o “shape”
	private GeneralPath shape;
	
	// Construtor, que recebe como um dos parâmetros o vetor de pontos (x,y)
	public Territory(Vertex p[], float deslocaX, float deslocaY)  {
		GeneralPath gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);

		gp.moveTo(p[0].get("x") + (deslocaX),p[0].get("y") + (deslocaY));
		
		for (int i = 1; i < p.length; i++) {
			gp.lineTo(p[i].get("x") + (deslocaX), p[i].get("y") + (deslocaY));
		}
		
		gp.closePath();
		this.shape = gp;
	}
	
	public GeneralPath getShape() {
		return this.shape;
	}
}