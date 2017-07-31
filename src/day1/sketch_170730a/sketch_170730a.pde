int x = 500;
int x2 = 1500;
int speed = 25;
void setup(){
   size(2000,2000);


}



void draw(){
  background(255,255,255);
  for (int a=300 ; a > 0; a-=5) {
      ellipse(x,500,a,a);
   
  } 
    x = x + speed;
  
  for (int i = 300; i > 0; i-=5) {
       ellipse(x2,500,i,i);
      
  }
     x2 = x2 - speed;
  
  if(x < 0){
    speed = -speed;
    
    
  }
  
  if(x>1850){
    speed = -speed;
  
  
  }
  
  
  
  
  
  
  
}