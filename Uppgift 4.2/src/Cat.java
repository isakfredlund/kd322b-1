
public class Cat extends Mammal{
	
	private int lives;

	public Cat(boolean alive, int lactationTime, int lives) {
		super(alive, lactationTime);
		this.lives = lives;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String info = "Alive : " + super.getAlive() + ". Lactation time in years: " + super.getLactationTime() + "Lives: " + lives;
		return info;
	}
	
	 

}
