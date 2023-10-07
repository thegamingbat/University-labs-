 class cwh extends base {
    cwh(){

        System.out.println("this is cwh");
    }
     cwh(int x){
        super(x);

         System.out.println("this is cwh with a value of x as " + 7);
     }
    public int y;

     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }

 }
 class base{
    public int x;

     public int getX() {
         return x;
     }

     public void setX(int x) {
         this.x = x;
     }


     base(){
        System.out.println("I am base constructur");
    }
     base(int x){
         System.out.println("I am base constructur with x value of" + x);
     }

}



