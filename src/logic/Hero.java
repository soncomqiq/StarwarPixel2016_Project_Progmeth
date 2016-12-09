package logic;

import lib.IRanderable;

public class Hero implements IRanderable {
	private int x,y,z;
	private int hispoint,mana;
	private int life;
	public Hero(int x,int y,int hispoint,int mana,int life){
		this.x=x;
		this.y=y;
		this.hispoint=hispoint;
		this.mana=mana;
		this.life=life;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getHispoint() {
		return hispoint;
	}
	public void setHispoint(int hispoint) {
		this.hispoint = hispoint;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	@Override
	public void rander() {
		// TODO Auto-generated method stub
	}
	@Override
	public int getZ() {
		return z;
	}

}
