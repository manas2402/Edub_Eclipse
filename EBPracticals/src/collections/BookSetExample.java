package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class books
{
	private int bid;
	private String bname;
	
	books(int bid, String bname)
	{
		this.bid=bid;
		this.bname=bname;
	}
	public void showBooks()
	{
		System.out.println("Book id : "+ bid + "Book name : "+ bname);

	}
}
public class BookSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		books sql = new books(5,"Sql");
		books java = new books(6,"Java");
		
		Set<books> bookSet = new HashSet<books>();
		
		bookSet.add(java);
		bookSet.add(sql);
		
		Iterator<books> itr = bookSet.iterator();
		while(itr.hasNext())
		{
			books book = itr.next();
			book.showBooks();

		}
	}

}
