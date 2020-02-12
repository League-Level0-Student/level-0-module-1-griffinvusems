PImage  Banana;
void setup(){
  Banana = loadImage("Banana.png");
  size(800,800);
}
  
  void draw(){

  for (int i = 0; i < 1000;  i++) {
    image(Banana,0,i*100, 100, 100);
  }
}  
