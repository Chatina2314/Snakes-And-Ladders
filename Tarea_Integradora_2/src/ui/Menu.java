package ui;
import java.util.Scanner;
import model.Board;
public class Menu {
	//Attributes
	private Menu mainMenu;
	public static Scanner lector;
	//Relations
		private Board[][] board;
		//Methods
		Menu(){
			lector = new Scanner(System.in);
			createPlay();
		}
		public static void menu(String[] args){
			Menu objMenu = new Menu();
			boolean menu=true;
			int opcions = 0;
			while(menu){
				System.out.println("1.- Play.");
	            System.out.println("2.- See leaderboard.");
	            System.out.println("3.- Exit.");
	            
	            System.out.println("Enter the action to perform: ");
				opcions=Integer.parseInt(lector.nextLine());
				switch(opcions){
				case 1:
					objMenu.createPlay();
					break;
					case 2:
					objMenu.();
					break;
					case 3:
					menu=false;
					break;
					default:
					System.out.println("Only numbers between 1 and 3.");
					break;
				}
			}
		}
		public void createPlay() {
			int n = lector.nextInt();
			int m = lector.nextInt();
			int s = lector.nextInt();
			int e = lector.nextInt();
			int p = lector.nextInt();
			mainMenu.createPlay(n, m, s, e, p);
		}
}