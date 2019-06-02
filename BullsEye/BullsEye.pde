int rings = 9;

void setup(){
  size(800,800);
}

void draw(){
  if (rings > 1){
    
  if (rings % 2 == 0){
    fill(#050000);
  }
  else{
    fill(#FA0D0D);
  }
  ellipse(400,400, (80*rings),(80*rings));
  rings = rings - 1;
  }
}
