
/*
 * abstract class betyder att man inte kan skapa instanser av den klassen, 
 * eftersom det inte finns ett objekt som är ett generiskt djur
 */
public abstract class Mammal extends Animal{

	private int lactationTime;
	
	public Mammal(boolean alive, int lactationTime) {
		
		super(alive);
		this.lactationTime = lactationTime;
	
		// TODO Auto-generated constructor stub
	}
	
	public int getLactationTime(){
		System.out.println("My lactationTime brings all the boys to the yard!");
		return lactationTime;
	}

	
			
}
