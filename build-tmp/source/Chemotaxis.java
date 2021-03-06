import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {



Bacteria[] colony;

PImage photoA;


	 public void setup()   
 {     
 	 size(851, 588);


 	colony = new Bacteria[1000];
	for (int i =0; i< colony.length; i++){
	colony[i] = new Bacteria(250,250,0,0,0);
  photoA = loadImage("1yellow-star-th.png");

  

  	}
 	
 }   
 public void draw()   
 {    
  

 	background(2, 13, 32);


  
 image(photoA, mouseX-50,mouseY-50);

  

 	for (int i =0; i< colony.length; i++)
 	{
 	colony[i].show();
 	colony[i].move();
 	colony[i].mouseMove();

    }
 }  
 class Bacteria    
 {     

 	int bacX;
	int bacY;
	int bacClrR;
	int bacClrB;
	int bacClrG;
 	
 	Bacteria(int x, int y, int clrR,int clrG,int clrB)
 	{

 		bacX = x;
 		bacY = y;
 		bacClrR =clrR;
 		bacClrG =clrG;
 		bacClrB =clrB;

 	}

 	public void move() {

 		

 		bacX = bacX +  (int)(Math.random()*15)-7;
 		bacY = bacY +  (int)(Math.random()*15)-7;
 	}
 
 	public void show (){

 		bacClrR = (int)(Math.random()*256);
 		bacClrB = (int)(Math.random()*256);
 		bacClrG = (int)(Math.random()*256);

 		noStroke();
 		fill(bacClrR,bacClrG,bacClrB);
        ellipse(bacX,bacY,10,10);
        fill(255,255,255,20);
 		ellipse(bacX,bacY,30,30);
 		
 		


 	}

 	public void mouseMove() {

 	 if(mouseX>bacX) 
 	 {
 	 	bacX = bacX +  (int)(Math.random()*15)-1;
 	 }

 	 if(mouseX<bacX) 
 	 {
 	 	bacX = bacX +  (int)(Math.random()*15)-14;
 	 }

 	 if(mouseY>bacY) 
 	 {
 	 	bacY = bacY +  (int)(Math.random()*15)-1;
 	 }

 	 if(mouseY<bacY) 
 	 {
 	 	bacY = bacY +  (int)(Math.random()*15)-14;
 	 }

 	}


 }

 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
