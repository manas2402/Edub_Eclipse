package MultiThreadingDemo;

class computer extends Thread
{
	public void run()
	{
	
		for(int i =1; i<=10;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class laptop extends Thread
{
	public void run()
	{
		for(int i =1; i<=20;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
public class multiThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		laptop l1 = new laptop();
		l1.start();
		
		computer c1 = new computer();
		c1.start();
	}

}
