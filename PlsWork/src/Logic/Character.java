package Logic;

import processing.core.PApplet;
import android.util.Log;

public class Character {
  
  int x;
  int y;
  int newx;
  int newy;
  int radius;
  int health;
  boolean visible;//POWER UP 
  boolean isZombie;
  int speed;
  public Character(int x,int y,int radius,int speed){
    this.x = x;
    this.y = y;
    newx = x;
    newy = y;
    this.speed=speed;
    this.radius = radius;
    health = 100;
    visible = true;
    isZombie = false;
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
  
  public void move(){
    int diffx = newx - x;
    int diffy = newy - y;
    String s ="from ("+x+","+y+") ";
    if(speed>Math.abs(diffx)){
      x=newx;
    }
    else if (diffx > 0) {
      x+=speed;
    } else if (diffx < 0) {
      x-=speed;
    }
    if(speed>Math.abs(diffy)){
      y=newy;
    }
     else if (diffy > 0) {
      y+=speed;
    } else if (diffy < 0) {
      y-=speed;
    }
    s += "to ("+x+","+y+")";
    //Log.d("UNIQUE ID",s);

    
  }
  
  public void setNewPosition(int x2,int y2,Board b){

    if(b.checkpath(x, y, x2, y2)){
      newx = x2;
      newy = y2;
    }
    else{
      int[] xandy = b.getpath(x, y, x2, y2);
      if(xandy!=null){
        newx = xandy[0];
        newy = xandy[1];
      }
      else{
    	  int xdiff = x2-x;
    	  xdiff = xdiff/Math.abs(xdiff);
    	  int ydiff = y2-y;
    	  ydiff = ydiff/Math.abs(ydiff);
    	  
    	  
    	  if(b.checkpath(x, y, x, y+ydiff)){
    		  newy = y + ydiff;
    	  }
    	  else if(b.checkpath(x, y, x+xdiff, y)){
    		  newx = x + xdiff;
    	  }
      }
    }
  }

  public void draw(PApplet p) {
    p.fill(40,30,240);
    p.ellipse((int)x, (int)y, radius, radius);
  }
  
}
