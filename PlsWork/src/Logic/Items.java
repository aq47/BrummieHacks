package Logic;

import java.awt.Image;


public class Items {
	
	private int x;
	private int y;
	private int duration;
	private boolean visible;
	private Image image;
	 
	
	public Items(int x, int y,String type) {
		this.x = x;
		this.y =y;
		
		
		/*switch(type){
			
		case "Flare" : image = 
				break;
		case "Trap" : image = //
				break;
		case "Cloak" : image = //
				break;
		
		
		
		}*/
	}
	
	public void setVisible(boolean yes)
	{
		this.visible = yes;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public boolean getVisible() {
		return visible;
	}
	public int getX()
	{
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void draw() {
		
		
	}

}
