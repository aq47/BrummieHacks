package com.example.plswork;


import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
import Logic.Board;
import Logic.Bubble;
import Logic.Building;
import Logic.Character;
import Logic.NewTileMap;
import Logic.Zombie;
import android.util.Log;


public class MainActivity2 extends PApplet {
	
	Board board;
	Character c1;
	Building b1;
	
	NewTileMap ntm;
	int x;
	int y;
	int newx = x;
	int newy = y;
	PImage p1;
	PImage p2;
	long timer;
	int num;
	final int target = 10;
	int duration = 3000;
	Bubble bub;
	
	public void setup() {
		size(displayWidth, displayHeight);
		x = width/2;
		y = height/2;
		newx=x;
		newy=y;
		//ellipse(x, y, 20, 20);
		bub = new Bubble();
		c1 = new Character(x,y+20,20,3);
		ArrayList<Character> chars = new ArrayList<Character>();
		chars.add(c1);
		ArrayList<Building> builds = new ArrayList<Building>();
		ArrayList<Zombie> zombs = new ArrayList<Zombie>();
		board = new Board(chars, zombs, builds);
		p1 = loadImage("ground-1.png");
		p2 = loadImage("block-1.png");
		 ntm = new NewTileMap(width,height,board);
	    ntm.loadTiles(p1,p2);
	    ntm.loadMap("level1-1.map");
	    ntm.draw(this);
	    timer = System.currentTimeMillis();
	    num = 0;
	    
		}

	public void draw() {
		//ntm.draw(this);
		background(200);
		stroke(0);
	    ntm.draw(this);
	    
		board.move();
		populateEnemies();
		bub.draw(this);
		
 	}

	private void populateEnemies(){
		if(num<target){
			if(System.currentTimeMillis() -timer >duration){
				board.addzombie();
				timer = System.currentTimeMillis();
				num++;
			}
		}
	}
	public void mousePressed() {
		board.movePlayer(mouseX,mouseY);
		bub.onmouseClicked(mouseX, mouseY);
	}
}