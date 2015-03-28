package Logic;

public class Character {
	
	private int x;
	private int y;
	private int health;
	private int image;
	private String type;
	private Items Flare;
	private Items Trap;
	private Items Cloak;
	private Items array[];
	private boolean visible;
	private boolean isZombie;
	public boolean up,down,left,right;
	
	public Character(int x, int y, String type) {
		this.x = x;
		this.y =y;
		this.type = type;
		this.health = 100;
		this.visible = true;
		this.isZombie = false;
		array = new Items[3];
		array[0] = Flare;
		array[1] = Trap;
		array[2] = Cloak;
		/*switch(type) {
		case "Red" : image = 
				break;
		case "Blue" : image = 
				break;
		case "Green" : image = 
				break;
		case "Yello" : image = 
				break;
		}*/
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Items[] getArray() {
		return array;
	}

	public void setArray(Items[] array) {
		this.array = array;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isZombie() {
		return isZombie;
	}

	public void setZombie(boolean isZombie) {
		this.isZombie = isZombie;
	}
	
	public void draw()
	{
		
	}
	
	
	
	
	
	

}
