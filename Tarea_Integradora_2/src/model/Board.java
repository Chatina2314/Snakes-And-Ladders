package model;
public class Board {
	//Attributes
	private int n = 0;
	private int m = 0;
	private int s = 0;
	private int e = 0;
	private long p;
	//Relations
	private Player first;
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
	public long getP() {
		return p;
	}
	public void setP(long p) {
		this.p = p;
	}
	public void addPlayer(String name, int score, String symbol, int moves, int rollDice) {
		Player add = new Player(name, score, symbol, moves, rollDice);
		if(first==null) {
			first = add;
		}
		else {
			Player last = first;
			
			while(last.getNext()!=null) {
				last = last.getNext();
			}
			last.setNext(add);
		}
	}
	public void createBoard(){
		
	}
}
