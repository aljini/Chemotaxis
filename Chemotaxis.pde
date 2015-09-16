Bacteria[] colony;



	 void setup()   
 {     
 	size(500, 500);
 	colony = new Bacteria[10];
	for (int i =0; i< colony.length; i++){
	colony[i] = new Bacteria(250,250,0,0,0);

 	
  	}
 	
 }   
 void draw()   
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

 	void move() {

 		

 		bacX = bacX +  (int)(Math.random()*21)-10;
 		bacY = bacY +  (int)(Math.random()*21)-10;
 	}
 
 	void show (){

 		bacClrR = (int)(Math.random()*256);
 		bacClrB = (int)(Math.random()*256);
 		bacClrG = (int)(Math.random()*256);

 		fill(bacClrR,bacClrG,bacClrB);
 		ellipse(bacX,bacY,10,10);


 	}


 }