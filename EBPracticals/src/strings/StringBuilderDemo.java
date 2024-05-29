package strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		
		System.out.println(sb);
		
		sb.append("java");
		System.out.println(sb);
		
		sb.insert(6,"test");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		int size = sb.length();
		System.out.println(size);
		
		sb.delete(6, 10);
		System.out.println(sb);
		
		sb.replace(0, 5, "H");
		System.out.println(sb);
		
		int cap = sb.capacity();
		System.out.println(cap);

	}

}
