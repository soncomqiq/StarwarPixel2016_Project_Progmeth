package logic;

public class Minions extends Enemy {
	protected int z;
	public Minions(int x, int y, int hispoint) {
		super(x, y, hispoint);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getZ() {
		return z;
	}

}
