package application;

import java.util.Scanner;

import boardgame.InputMismachException;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
public class Program {

	public static void main(String[] args) throws InputMismachException {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch ChessMatch = new ChessMatch();
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printMatch(ChessMatch);
				System.out.println();
				System.out.print("source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean [][] possibleMoves = ChessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(ChessMatch.getPieces(), possibleMoves);
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece CapturedPiece = ChessMatch.performChessMove(source, target);
			}
			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				
			}
			catch (InputMismachException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				
			}
			
		}
	}

}
