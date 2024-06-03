package interfaces;

interface animal
{
	public void makeSound();
	public void run();
}

class tiger implements animal
{
	@Override
	public void makeSound() {
		System.out.println("tiger shouts");

	}
	@Override
	public void run() {
		
	}
}

class dogs implements animal
{
	@Override
	public void makeSound() {
		System.out.println("Dogs woofs");

	}
	@Override
	public void run() {
		
	}
	
}
class cats implements animal
{
	@Override
	public void makeSound() {
		System.out.println("cats meows");

	}
	@Override
	public void run() {
		
	}
}

public class sampleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cats c = new cats();
		dogs d = new dogs();
		tiger t = new tiger();
		
		c.makeSound();
		d.makeSound();
		t.makeSound();
		
	}

}
