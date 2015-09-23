
Bacteria[] colony;

PImage photoA;
PImage photoB;

	 void setup()   
 {     
 	 size(851, 588);


 	colony = new Bacteria[1000];
	for (int i =0; i< colony.length; i++){
	colony[i] = new Bacteria(250,250,0,0,0);
  photoA = loadImage("yellow-star-th.png");
 	photoA.resize(40,40);
  photoB = loadImage("yellow-star-th.png");
  photoB.resize(70,70);

  	}
 	
 }   
 void draw()   
 {    
  

 	background(2, 13, 32);

  

  image(photoB, mouseX-35,mouseY-35);
   photoB.filter(BLUR,1);
  
  
 image(photoA, mouseX-20,mouseY-20);

  

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

 	void move() {

 		

 		bacX = bacX +  (int)(Math.random()*15)-7;
 		bacY = bacY +  (int)(Math.random()*15)-7;
 	}
 
 	void show (){

 		bacClrR = (int)(Math.random()*256);
 		bacClrB = (int)(Math.random()*256);
 		bacClrG = (int)(Math.random()*256);

 		noStroke();
 		fill(bacClrR,bacClrG,bacClrB);
        ellipse(bacX,bacY,10,10);
        fill(255,255,255,20);
 		ellipse(bacX,bacY,30,30);
 		
 		


 	}

 	void mouseMove() {

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

 
