package com.example.plswork;

import processing.core.PApplet;

public class MainActivity2 extends PApplet {

	int x;
	int y;
	int newx = x;
	int newy = y;

	public void setup() {
		size(displayWidth, displayHeight);
		x = width/2;
		y = height/2;
		newx=x;
		newy=y;
		ellipse(x, y, 10, 10);
	}

	public void draw() {
		background(200);
		fill(100, 200, 155);
		ellipse(x, y, 10, 10);

		int diffx = newx - x;
		int diffy = newy - y;
		// if(diffx != 0 && diffy != 0){
		// for(int i = 0; i < 10; i++){
		if (diffx > 0) {
			x++;
		} else if (diffx < 0) {
			x--;
		}
		if (diffy > 0) {
			y++;
		} else if (diffy < 0) {
			y--;
		}
		// }
		// }
		println("newx = " + newx + " x = " + x);

	}

	public void mousePressed() {
		newx = mouseX;
		newy = mouseY;
	}
}