package logic;

import lib.IRanderable;

public abstract class Enemy implements IRanderable {
	protected int x,y;
	protected int hispoint;
	public Enemy(int x,int y,int hispoint){
		this.x=x;
		this.y=y;
		this.hispoint=hispoint;
	}
	@Override
	public void rander() {
		// TODO Auto-generated method stub

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

}
