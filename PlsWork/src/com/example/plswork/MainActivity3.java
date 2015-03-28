package com.example.plswork   ;

import processing.core.PApplet;

public class MainActivity3 extends PApplet {
	public void setup() {
		  size(displayWidth, displayHeight, P3D);
		  orientation(LANDSCAPE);
		  noStroke();
		}

		public void draw() {
		  lights();
		  background(204);
		  float cameraY = (float) (height/2.0);
		  float fov = mouseX/(float)(width) * PI/2;
		  float cameraZ = cameraY / atan((float) (fov / 2.0));
		  float aspect = (float)(width)/(float)(height);
		  if (mousePressed) {
		    aspect = (float) (aspect / 2.0);
		  }
		  perspective(fov, aspect, (float)(cameraZ/10.0), (float)(cameraZ*10.0));
		  
		  translate(width/2+30, height/2, 0);
		  rotateX(-PI/6);
		  rotateY(PI/3 + mouseY/(float)(height) * PI);
		  box(45);
		  translate(0, 0, -50);
		  box(30);
		}
}
