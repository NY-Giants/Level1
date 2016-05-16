
int y = 50;
int x = 50;
int a = 50;
int b = 50;
double birdYVelocity = 1;
double gravity = .25;
int pipe_x = 250; 
int pipe_y = 500; 
int pipe_w = 25;
int pipe_h = 500;
void setup(){
 size(1000, 1000);

}
void draw(){
 background(79, 124,233); 
  fill(69, 112, 154);
  ellipse(x, y,50,50);
  birdYVelocity += gravity;
  y+= (int) birdYVelocity;
  if(mousePressed){
    flap();
  }
  rect(pipe_x,pipe_y,pipe_w,pipe_h);
  pipe_x = pipe_x -1;
  if(pipe_x <= -pipe_w){
    pipe_x = 1000;
    int random = (int) random(100,400);
    pipe_y = random;
  }
if(intersects(x,y, pipe_x,pipe_y,pipe_w)){
  
System.exit(0);
}
}



void flap(){
  birdYVelocity -= 1;
  
}
  boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
  }
