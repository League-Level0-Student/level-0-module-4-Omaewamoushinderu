PImage creeper;     //at the top of your program
int x = 10; 
int y = 423;
void setup(){
size(500, 500); //in setup method
PImage minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(500, 500);          //in setup method
background(minecraft);          //in setup method

creeper=loadImage("creeper.png");     //in setup method
creeper.resize(50, 50);     //in setup method
}

void draw(){
  image(creeper, x, y);     //in draw method

  if(mousePressed){
    
 fill(#F70707);
   
    if(isNear (mouseX, x)  && isNear (mouseY, y) ){
      fill(#16F707);
    }
     ellipse(mouseX,mouseY,10,10);
  }
}
  boolean isNear(int a, int b) {
if (abs(a - b) < 50)
     return true;
else
     return false;
}