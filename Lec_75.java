
//class MyNewThr1 extends Thread{
    /*public MyNewThr1(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Thank u" + getName() );
            i++;        
        }

        
    }
}*/
class MyNewThr1 extends Thread{
public MyNewThr1(String name){
    super(name);
}

public void run(){
    int i=0;
    while(true){
        System.out.println("Thank u"  );
        try{
            Thread.sleep(1000);
        }
           catch(InterruptedException e){
             e.printStackTrace();
           }
    

        i++;        
    }

    
}
}





class MyNewThr2 extends Thread{
    public MyNewThr2(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while(i<10){
            System.out.println( "My" +" " +"Thank u" + getName());
            i++;
        }
        
    }
}








public class Lec_75 {
    public static void main(String[] args) {

    MyNewThr1 t1=new MyNewThr1("Yash");
    MyNewThr2 t2=new MyNewThr2("Yash2");
    t1.start();
    t2.start();
  /*  try{
        t1.join();
    }
    catch(Exception e){
        System.out.println(e);
    }
  
    t2.start();*/
    
    
    
    
    
    }
}
