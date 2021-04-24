 package model;
public class Board {
	//Attributes
	private int n = 0;
	private int m = 0;
	private int s = 0;
	private int e = 0;
	//Methods
	Board(int pN, int pM, int pS, int pE){
		n = pN;
		m = pM;
		s = pS;
		e = pE;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
}
