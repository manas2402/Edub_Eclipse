package MultiThreadingDemo;

class computer1 implements Runnable
{
	public void run()
	{
	
		

	}
}

class laptop1 implements Runnable
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

public class multiThreadingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable l1 = ()-> 
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
		};
		
		
		Runnable c1 = new computer1();
		
		Thread t1 = new Thread(l1);
		Thread t2 = new Thread(c1);
		
		t1.start();
		t2.start();
	}

}
