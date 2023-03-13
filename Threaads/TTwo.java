import java.lang.*;
class TTwo extends Thread
{
public void run()
{
System.out.println("Thread is running");
}
public static void main(String args[])
{
TTwo T=new TTwo();
Thread TH=new Thread(T);
TH.start();
}
}
