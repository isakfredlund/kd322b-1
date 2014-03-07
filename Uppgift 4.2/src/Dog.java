
public class Dog extends Mammal{
	
	private boolean barks;

	public Dog(boolean alive, int lactationTime, boolean barks) {
		super(alive, lactationTime);
		this.barks = barks;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String info = "Alive : " + super.getAlive() + ". Lactation time (years): " + super.getLactationTime() + ". wow such barks, liek : " + barks;
		return info;
	}

}
