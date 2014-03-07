
public class Bike {
	
	Constants cons = new Constants();

	private String color;
	private int price;
	private int size;
	private static int nbrOfBikes;
	
	public Bike(String _color, int _size){
		color = _color;
		size = _size;
		nbrOfBikes++;
	}
	
	/**Creates a Bike with input parameters that are checked against values specified in Constants.java*/
	public Bike(String _color, int _size, int _price){
		color = checkColor(_color);
		if (_size < cons.MIN_SIZE){
			size = cons.MIN_SIZE;
		}else if (_size > cons.MAX_SIZE){
			size = cons.MAX_SIZE;
		}else{
			size = _size;
		}
		if (_price < cons.MIN_PRICE){
			price = cons.MIN_PRICE;
		}else if(_price > cons.MAX_PRICE){
			price = cons.MAX_PRICE;
		}else{
			price = _price;
		}
		nbrOfBikes++;
	}
	
	/**Gets the color specified in Bike()*/
	public String getColor(){
		return color;
	}
	
	/**Gets the size specified in Bike()*/
	public int getSize(){
		return size;
	}
	
	/**Gets the price specified in Bike()*/
	public int getPrice(){
		return price;
	}
	
	/**Assigns a new value to price*/
	public int setPrice(String _price){
		int __price = Integer.parseInt(_price);
		if (__price < cons.MIN_PRICE){
			price = cons.MIN_PRICE;
		}else if(__price > cons.MAX_PRICE){
			price = cons.MAX_PRICE;
		}else{
			price = __price;
		}
		return price;
	}
	/**Assigns a new value to color*/
	public String setColor(String _color){
		color = _color;
		return color;
	}
	
	/**Assigns a new value to size*/
	public int setSize(String _size){
		int __size = Integer.parseInt(_size);
		if (__size < cons.MIN_SIZE){
			size = cons.MIN_SIZE;
		}else if(__size > cons.MAX_SIZE){
			size = cons.MAX_SIZE;
		}else{
			size = __size;
		}
		return size;
	}

	/**Gets the value of the amount of Bikes that have been created*/
	public static int getNumberOfBikes(){
		return nbrOfBikes;
	}
	
	/**Checks if the color is available according to that specified in Constants.java and returns the input color if true*/ 
	public String checkColor(String inputColor){
		for(int c = 0; c < cons.availableColors.length; c++){
			if(inputColor.compareToIgnoreCase(cons.availableColors[c]) == 0){
				return inputColor;
				}
			}return "null";
	}
	
}
