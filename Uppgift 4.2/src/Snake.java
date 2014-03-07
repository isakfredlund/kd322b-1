
public class Snake extends Animal {
	
	private boolean poisonous;
	
	public Snake(boolean alive, boolean poisonous) {
		super(alive);
		this.poisonous = poisonous;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String info = "Alive : " + super.getAlive() + "Poisonous: " + poisonous;
		return info;
	}

}
