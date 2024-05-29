package Assignment6_29_05_24;

class calc{
	float m1;
	float m2;
	float m3;
	float sum;
    float sub;
    float mul;
    float div;

	public calc(float m1, float m2, float m3) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	
	 this.sum = m1+m2+m3;
	 this.sub = m1-m2-m3;
	 this.mul = m1*m2*m3;
	 this.div = m1/m2;
	}
}


public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc math1 = new calc(5,4,3);
		System.out.println(math1.sum);
		System.out.println(math1.sub);
		System.out.println(math1.mul);
		System.out.println(math1.div);
		
		calc math2 = new calc(10,5,1);
		System.out.println(math2.sum);
		System.out.println(math2.sub);
		System.out.println(math2.mul);
		System.out.println(math2.div);
		
	}

}
