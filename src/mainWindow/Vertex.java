package mainWindow;

public class Vertex {
	private int x;
	private int y;
	
	public Vertex(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int get(String x){
		if(x.equals("x") == true){
			return this.x;
		}
		else if(x.equals("y") == true){
			return this.y;
		}
		
		return -1;
	}
}
