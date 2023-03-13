class TFive extends Thread
{    
 public void run()
{    
System.out.println("Thread Started"+Thread.currentThread().getName());
  }       
 public static void main(String args[])
{    
TFive T1=new TFive();
TFive T2=new TFive();     
  T1.start();    
  T2.start();    
 }    
}    