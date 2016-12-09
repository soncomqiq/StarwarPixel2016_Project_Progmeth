package logic;

public class Boss extends Enemy{
	protected int mana;
	public Boss(int x, int y, int hispoint,int mana) {
		super(x, y, hispoint);
		this.mana=mana;
		// TODO Auto-generated constructor stub
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return 0;
	}

}
