import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ticatactoe {
	
	static ArrayList<Integer> playerPositions=new ArrayList<>();
	static ArrayList<Integer> cpuPositions=new ArrayList<>();
	
	public static void main(String[] args) {
		
		char gameBoard[][]= {{' ', '|' ,' ','|',' '},
				{'-','+','-','+','-'},
				{' ', '|' ,' ','|',' '},
				{'-','+','-','+','-'},
				{' ', '|' ,' ','|',' '}};
		printGameBoard(gameBoard);
		
		while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the position :");
		int playerPos=scan.nextInt();
		while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
			System.out.println("Position taken! Enter again");
			playerPos=scan.nextInt();
		}
		placePiece(gameBoard, playerPos, "player");
		
//		printGameBoard(gameBoard);

		
		Random rand=new Random();
		int cpuPos=rand.nextInt(9) + 1;
		while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
			cpuPos=rand.nextInt(9) + 1;
		}
		placePiece(gameBoard, cpuPos, "cpuPosition");
        printGameBoard(gameBoard);
		
		String result=checkWinner();
		if(result.length() > 0) {
		System.out.println(result);
		break;
		}
		}

	}
	
	public static void printGameBoard(char [][]gameBoard) {
		
			
			for(char[] row:gameBoard) {
				for(char cha:row) {
					System.out.print(cha);
				}
				System.out.println();
			}
	}
	
	public static void placePiece(char [][] gameBoard, int pos, String user) {
		char symbol=' ';
		if(user.equals("player")) {
			symbol='X';
			playerPositions.add(pos);
		}
		else if(user.equals("cpuPosition")) {
			symbol='O';
	        cpuPositions.add(pos);
		}
		
		switch(pos){
		case 1:
			gameBoard[0][0]=symbol;
			break;
		
case 2:
	gameBoard[0][2]=symbol;
	break;

case 3:
	gameBoard[0][4]=symbol;
	break;

case 4:
	gameBoard[2][0]=symbol;
	break;

case 5:
	gameBoard[2][2]=symbol;
	break;

case 6:
	gameBoard[2][4]=symbol;
	break;

case 7:
	gameBoard[4][0]=symbol;
	break;

case 8:
	gameBoard[4][2]=symbol;
	break;

case 9:
	gameBoard[4][4]=symbol;
	break;

default:
	break;
	}

}
	public static String checkWinner() {
		List topRow=Arrays.asList(1,2,3);
		List midRow=Arrays.asList(4,5,6);
		List botRow=Arrays.asList(7,8,9);
		List leftCol=Arrays.asList(1,4,7);
		List midCol=Arrays.asList(2,5,8);
		List rightCol=Arrays.asList(3,6,9);
		List diag1=Arrays.asList(1,5,9);
		List diag2=Arrays.asList(7,5,3);
		
		List<List> l=new ArrayList<List>();
		l.add(topRow);
		l.add(midRow);
		l.add(botRow);
		l.add(leftCol);
		l.add(midCol);
		l.add(rightCol);
		l.add(diag1);
		l.add(diag2);
		
		for(List b:l) {
		if(playerPositions.containsAll(b)) {
			return "Congratulations! you won";
		}
		else if(cpuPositions.containsAll(b)) {
			return "Cpu won! Sorry :(";
		}
		else if(playerPositions.size() + cpuPositions.size() == 9 ){
			return "CAT!";
		}
		}
		return "";
	}
	
	
}