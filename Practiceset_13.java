
//Problem 1



/*class MyThr extends Thread{
  public void run(){
    while(true){
        System.out.println("Good Morning");
    }
   
  }
}

class MyThr2 extends Thread{
    
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}*/


//Problem 2
/*class MyThr extends Thread{
    public void run(){
      
        while(true){
             

            try{
              Thread.sleep(200);
            }
            catch(Exception e) {
              System.out.println(e);
             
            }
          System.out.println("Good Morning");
      }
     
    }
  }*/
  
  
  
  /*class MyThr2 extends Thread{
      
      public void run(){
    
          while(true){
             

              try{
                Thread.sleep(200);
              }
              catch(Exception e) {
                System.out.println(e);
               
              }
              System.out.println("Welcome");
              
          }
         
      }
  }*/

//Problem 3
 /*  class MyThr extends Thread{
    public void run(){
      
        while(true){
        System.out.println("Good Morning");
      }
     
    }
  }

  class MyThr2 extends Thread{
    public void run(){
      
        while(true){
            System.out.println("Welcome");
     }
     
    }
  }*/


  /*class MyThr extends Thread{
    public void run(){
      
        while(true){
        System.out.println("Good Morning");
      }
     
    }
  }*/

  //Problem 4
  /*class MyThr2 extends Thread{
    public void run(){
      
      
            System.out.println("Welcome");
     
     
    }
  }*/

  class MyThr2 extends Thread{
    public void run(){
      
      
            System.out.println("Welcome");
     
     
    }
  }






public class Practiceset_13 {
    public static void main(String[] args) {

        //MyThr t1=new MyThr();
       
        MyThr2 t2=new MyThr2();
       /* t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();*/
        t2.start(); 
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
        
    }
}
