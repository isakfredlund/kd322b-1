import java.util.ArrayList;


public class BikeShop {
	/***
	 * Stores all bikes
	 */
		ArrayList<Bike> bikeList = new ArrayList<Bike>();
		
		
		public static void main(String[] args){
		}
	
	/** Gets all Bike objects and put their values into a string. */
    public String getAllBikes(){
        String bikeText = "";
        for (Bike b : bikeList){
           bikeText += "Color: " + b.getColor() + ". Size: " + b.getSize() + ". Price: " + b.getPrice() + "\n";
           }
        return bikeText;
        }

	/** Adds a new Bike object */
    public void addBike(String color, String size, String price){
    	bikeList.add(new Bike(color,Integer.parseInt(size),Integer.parseInt(price)));
    }
	
}

