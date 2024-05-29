package branchingStatements;

public class switchDeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 3;
		String dayName;
		
		dayName = switch(day) {
		case 1,2,3,4,5 -> "Weekday";
		case 6,7 -> "Weekends";
		default -> "Invalid day";
		};
		System.out.print("The day seleceted is :" + dayName);
		int sum1 = 0;
        for (int i = 5; i >= 1; i--) {
            sum1 += i;
        }
        System.out.println("Sum of numbers from 5 to 1: " + sum1);
        
        //sumwhiledemo
        int n,r,sum=0;
		
		n=154; // 1+5+4 =10
		
		while(n>0)
		{
			r=n%10;        
			sum=sum+r;
			n=n/10;
		}
		System.out.println("sum of digits: " +sum);
	}

}
