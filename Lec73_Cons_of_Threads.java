
/*class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        int i=34;
        System.out.println("Thank you");
       while(true){
        //System.out.println("I am a thread");
       } 
    }
}*/



class YourThread2 extends Thread implements Runnable{
    public YourThread2(String name){
        super(name);
    }

    @Override
    public void run() {

        System.out.println("Thank u");
    }
}







public class Lec73_Cons_of_Threads {
    public static void main(String[] args) {
    /*MyThr t =new MyThr("Harry");    
    MyThr t2=new MyThr("Ram Candr");
        t.start();
        t2.start();
    System.out.println("The id of the thread t is" + t.getId());
    System.out.println("The name of the thread t is" + " " + t.getName());
    System.out.println("The id of the thread t is" + " " + t2.getId());
    
    System.out.println("The name of thread 2 is " + " " + t2.getName());
    */

    //Task given in the class

    YourThread2 y2=new YourThread2("Adnan");
    Thread t=new Thread(y2,"Adnannn");
    t.start();
    System.out.println("Thread id is "+t.threadId());
    System.out.println("Thread name is "+y2.getName());//If i want to see YourThread2 name so i need to write y2.getName()
    System.out.println("Thread name is "+t.getName());//If i want to see Thread name so i need to write t.getName()



   



    
    }
}
