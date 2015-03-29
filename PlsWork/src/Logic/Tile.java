package Logic;


import processing.core.PImage;

public  class Tile {
	  
	  
	   PImage image;
	   int type;
	  
	   static final int NORMAL = 0;
	   static final int BLOCKED = 1;
	  
	   public Tile(PImage image, int type){
	    
	    this.image = image;
	    this.type = type;
	    
	  }
	  
	   public int getType(){ return type;}
	   public PImage getImage() {return image;}
	   public void resize(int newsize) {image.resize(newsize,newsize);}

	}
