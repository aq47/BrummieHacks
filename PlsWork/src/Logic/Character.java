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
  
  public void move(Board b){
    if(newx != x ){
      int diffx = newx - x;
      int xdiff = (diffx /Math.abs(diffx))*speed;
      if(b.checkpath(x,y,x+xdiff,y)){
        if(speed>Math.abs(diffx)){
          x=newx;
        }
        else{
          x+=xdiff;
        }    
      }
    }
    if(newy!=y){
      int diffy = newy - y;
      int ydiff = (diffy /Math.abs(diffy))*speed;
      if(b.checkpath(x,y,x,y+ydiff)){
        if(speed>Math.abs(diffy)){
          y=newy;
        }
        else{
          y+=ydiff;
        }
      }
    }

    
  }
  
  public void setNewPosition(int x2,int y2){
    
   newx = x2;
   newy = y2;
  }

  public void draw(PApplet p) {
    p.fill(40,30,240);
    p.ellipse((int)x, (int)y, radius, radius);
  }
  
}
