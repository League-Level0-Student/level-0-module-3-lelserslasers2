float ringOneX = 100;
float ringTwoX = 900;
int direction = 1;
void drawRingOne(float x){
  for (int i = 20; i >0; i--){
    noFill();
    ellipse(x, 500, 10*i, 10*i);
  }
}

void drawRingTwo(float x){
  for (int i = 20; i >0; i--){
    noFill();
    ellipse(x, 500, 10*i, 10*i);
  }
}



void drawRingThree(float y){
  for (int i = 20; i >0; i--){
    noFill();
    ellipse(500, y, 10*i, 10*i);
  }
}

void drawRingFour(float y){
  for (int i = 20; i >0; i--){
    noFill();
    ellipse(500, y, 10*i, 10*i);
  }
}


void setup(){
  size(1000,1000);
}

void draw(){
  background(#FAFAF7);
  drawRingThree(ringOneX);
  drawRingOne(ringOneX);
  drawRingFour(ringTwoX);
  drawRingTwo(ringTwoX);
  if (ringOneX == 1000){
   direction = 2; 
  }
  if (ringOneX == 0){
   direction = 1; 
  }
  if (direction == 1){
    ringOneX = ringOneX + 0.5;
  }
  else{
    ringOneX = ringOneX - 0.5;
  }
  ringTwoX = 1000 - ringOneX;
}
