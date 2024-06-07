package collections;

import java.util.HashMap;
import java.util.Map;

class biker
{
	private int bikeModel;
	private String bikeName;
	
	biker(int bikeModel, String bikeName)
	{
		this.bikeModel = bikeModel;
		this.bikeName = bikeName;
	}
	public void showBiker()
	{
		System.out.println("Bike Model : "+ bikeModel);
		System.out.println("Bike Name : "+ bikeName);
	}
}

public class HashMapBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		biker honda = new biker(2021,"Honda");
		biker KTM = new biker(2023,"KTM");
		biker Hero = new biker(2024,"Splender");
		
		Map<Integer, biker> bikeRoom = new HashMap<Integer,biker>();
		
		bikeRoom.put(111, honda);
		bikeRoom.put(112, KTM);
		bikeRoom.put(113, Hero);
		
		System.out.println(bikeRoom.keySet());
		
		for(Map.Entry<Integer, biker> bike : bikeRoom.entrySet())
		{
			int key = bike.getKey();
			System.out.println("Key is : "+key);

			biker b = bike.getValue();
			b.showBiker();
		}

	}

}
