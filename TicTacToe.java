package TicTacToeGame;

import java.util.*;
public class TicTacToe {

	public static void main(String args[]) {
		
		singleGame g1=new singleGame();
		g1.startGame();
	}
	
}

class singleGame{
	char[][] grid = new char[3][3];
	int[] pos=new int[2];
	Scanner in =new Scanner(System.in);
	boolean winFlag=false;
void startGame() {
	int playCount=0;
	System.out.println("Player 1 is * and Player 2 is o");
	while(winFlag==false&&playCount<=8) {
	player1entry();
	playCount++;
	checkWin();
	player2entry();
	playCount++;
	checkWin();
	}
	if(winFlag==false)
		System.out.println("Its a draw!");
}
	
void checkWin(){
	if(grid[1][1]=='*'||grid[1][1]=='o') {
	if(grid[1][1]==grid[2][1]&&grid[1][1]==grid[1][2]){
	winFlag=true;
	if(grid[pos[0]][pos[1]]=='*')
	System.out.println("player 1 won");
	else
		System.out.println("player 2 won");
	}
	else if(grid[1][1]==grid[1][2]&&grid[1][1]==grid[2][1]){
		winFlag=true;
		if(grid[pos[0]][pos[1]]=='*')
		System.out.println("player 1 won");
		else
			System.out.println("player 2 won");
		}
	else if(grid[1][1]==grid[2][2]&&grid[1][1]==grid[0][0]){
		winFlag=true;
		if(grid[pos[0]][pos[1]]=='*')
		System.out.println("player 1 won");
		else
			System.out.println("player 2 won");
		}
	}
	if(grid[0][0]=='*'||grid[0][0]=='o') {
		if(grid[0][0]==grid[0][1]&&grid[0][0]==grid[0][2]) {
			winFlag=true;
			if(grid[pos[0]][pos[1]]=='*')
			System.out.println("player 1 won");
			else
				System.out.println("player 2 won");	
		}
		if(grid[0][0]==grid[1][0]&&grid[0][0]==grid[2][0]) {
			winFlag=true;
			if(grid[pos[0]][pos[1]]=='*')
			System.out.println("player 1 won");
			else
				System.out.println("player 2 won");	
		}
	}
	if(grid[2][2]=='*'||grid[2][2]=='o') {
		if(grid[2][2]==grid[2][0]&&grid[2][2]==grid[2][1]) {
			winFlag=true;
			if(grid[pos[0]][pos[1]]=='*')
			System.out.println("player 1 won");
			else
				System.out.println("player 2 won");	
		}
		if(grid[2][2]==grid[0][2]&&grid[2][2]==grid[1][2]) {
			winFlag=true;
			if(grid[pos[0]][pos[1]]=='*')
			System.out.println("player 1 won");
			else
				System.out.println("player 2 won");	
		}
	}
}

void player1entry() {
	System.out.println("Player 1: enter the position");
	pos[0]=in.nextInt();
	pos[1]=in.nextInt();
	enterPlayer1(pos);
	displayGrid();
}
void player2entry() {
	System.out.println("Player 2: enter the position");
	pos[0]=in.nextInt();
	pos[1]=in.nextInt();
	enterPlayer2(pos);
	displayGrid();
}
	void enterPlayer1(int[] pos) {
		if(grid[pos[0]][pos[1]]!='o')
		grid[pos[0]][pos[1]]='*';
		else
		System.out.println("Wrong position:enter again");
	}
	void enterPlayer2(int[] pos) {
		if(grid[pos[0]][pos[1]]!='*')
		grid[pos[0]][pos[1]]='o';
		else
		System.out.println("Wrong position:enter again");
	}
	void displayGrid() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(grid[i][j]);
				if(j!=2)
					System.out.print("|");
			}
			System.out.println();
			if(i!=2)
			System.out.println("- - -");
		}
		System.out.println();
	}
}
