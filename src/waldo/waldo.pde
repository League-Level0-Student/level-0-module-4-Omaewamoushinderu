int x = 500;
int y = 500;
void setup() {
  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  size(500, 500);
  image(waldo, 0, 0);
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
println("X: " + mouseX + " Y: " + mouseY); 
if(mousePressed){
if (mouseX < x && mouseY < y ){
println("Waldo found");
}
}
else{
  
}
      // If the mouse is on Waldo, print “Waldo found!”

      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;