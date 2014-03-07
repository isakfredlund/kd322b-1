import java.util.ArrayList;


public class Human {
	
	//final i stora bokstäver
	public static final int MIN_LENGTH = 3;
	
	private Dog dog;
	private String name;
	
	//konstruktor
	public Human(String _name){
		name = _name;
	}
	
	//ger namnet
	public String getName(){
		return name;
	}
	
	//bestämmer 
	public void buyDog(Dog _dog){
		this.dog = _dog;
	}
	
	public String getInfo(){
		if (name != null && dog != null){
				return (name + " äger en hund som heter " + dog.getName());
			}else if (name != null && dog == null){
				return (name + " äger inte en hund");
			}else {
				return null;
		}
	}

}

