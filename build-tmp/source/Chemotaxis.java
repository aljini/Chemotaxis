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



	 public void setup()   
 {     
 	size(500, 500);
 	colony = new Bacteria[10];
	for (int i =0; i< colony.length; i++){
	colony[i] = new Bacteria(250,250,0,0,0);

 	
  	}
 	
 }   
 public void draw()   
 {    
 	for (int i =0; i< colony.length; i++)
 	{
 	colony[i].show();
 	colony[i].move();
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

 		

 		bacX = bacX +  (int)(Math.random()*21)-10;
 		bacY = bacY +  (int)(Math.random()*21)-10;
 	}
 
 	public void show (){

 		bacClrR = (int)(Math.random()*256);
 		bacClrB = (int)(Math.random()*256);
 		bacClrG = (int)(Math.random()*256);

 		fill(bacClrR,bacClrG,bacClrB);
 		ellipse(bacX,bacY,10,10);


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
