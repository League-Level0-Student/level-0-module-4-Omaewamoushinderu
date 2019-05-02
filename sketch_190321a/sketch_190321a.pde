PImage donkey;
PImage tail;

import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

void setup() {
  size(500,500); 
donkey = loadImage("donkey.png");      //change the file name if you need to
donkey.resize(500,500);
tail = loadImage("tail.jpeg");      //change the file name if you need to  

image(tail, mouseX, mouseY);
tail.resize(10, 10); 
  image(tail, mouseX-10, mouseY-20);
  rect(0, 0, 30, 30);
  rect(454, 75, 40, 40);
   
Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to

}

 




void draw() {
  if(  dist(0, 0, mouseX, mouseY) < 30){
background(donkey); 
// put these lines where you want the sound to play
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
  
  }
}