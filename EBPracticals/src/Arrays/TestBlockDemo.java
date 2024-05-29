package Arrays;

public class TestBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Manas";
		int x =10;
		String textbook = """
				
				{
				"name":"Manas Tripathi",
				"Age":"27",
				"Address":{
			"House No.":"330/58",
			"City":"Bhilai",
			"State":"C.G"
				}
			
			}
	""";
		System.out.println(textbook);
		
		
		String finalMail = String.format(textbook, name,x);
		System.out.printf("%s",finalMail);
		System.out.printf("%d",x);

	}

}
