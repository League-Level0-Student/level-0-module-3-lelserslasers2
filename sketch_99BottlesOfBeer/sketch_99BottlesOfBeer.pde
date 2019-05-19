int bottles = 99;
void setup(){
  
}

void draw(){
  if (bottles != 0){
    println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
    bottles = bottles - 1;
    println("Take one down and pass it around, " + bottles + " bottles of beer on the wall.");


  }
}
