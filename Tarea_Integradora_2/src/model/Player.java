package model;
public class Player {
	//Attributes
	private String name = "";
	private int score = 0;
	private String symbol = "";
	private int moves = 0;
	private int rollDice = 0;
	//Methods
	public Player(String pName, int pScore, String pSymbol, int pMoves, int pRollDice) {
		name = pName;
		score = pScore;
		symbol = pSymbol;
		moves = pMoves;
		rollDice = pRollDice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getMoves() {
		return moves;
	}
	public void setMoves(int moves) {
		this.moves = moves;
	}
	public int getRollDice() {
		return rollDice;
	}
	public void setRollDice(int rollDice) {
		this.rollDice = rollDice;
	}
}
