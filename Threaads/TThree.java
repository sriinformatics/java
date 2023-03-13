import java.lang.*;
class TThree extends Thread
{
public void run()
{
System.out.println("Thread is running");
}
public static void main(String args[])
{
 Thread TH=new Thread(new TThree());

TH.start();
}
}
