import java.awt.List;
import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Bike> bikeList = new ArrayList<Bike>();
		
		bikeList.add(new Bike("red", 28, 3000));
		bikeList.add(new Bike("blue", 18, 2400));
		bikeList.add(new Bike("green", 24, 6000));
		bikeList.add(new Bike("violet", 24, 1500));
		bikeList.add(new Bike("black", 24, 3200));
		bikeList.add(new Bike("orange", 28, 86000));
		bikeList.add(new Bike("puke-green", 14, 1000));
		bikeList.add(new Bike("white", 12, 800));
		bikeList.add(new Bike("yellow", 18, 1100));
		bikeList.add(new Bike("purple", 20, 1800));
		
		int i = 1;
		for(Bike B: bikeList){
			String bikeInfo = new String("Bike " + i + " - " + "Color: " + B.getColor() + ". Size: " + B.getSize() + ". Price: " + B.getPrice());
			System.out.println(bikeInfo);
			i++;
		}
		
		
	}
}


