import java.util.Scanner;

public class Assignment_part_b_20_04_2024 {

		static void vowel_or_consonant(char ch)
		{
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			System.out.println(ch + " is a Vowel");
			else
			System.out.println(ch + " is a Consonant");
		}

		public static void main (String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the character : ");
			char ch = sc.next().charAt(0);
			vowel_or_consonant(ch);
		}
		}

