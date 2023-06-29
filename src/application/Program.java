package application;

import java.util.Scanner;

import boardgame.InputMismachException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
public class Program {

	public static void main(String[] args) throws InputMismachException {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch ChessMatch = new ChessMatch();
		
		while (true) {
			UI.printBoard(ChessMatch.getPieces());
			System.out.println();
			System.out.print("source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece CapturedPiece = ChessMatch.performChessMove(source, target);
			
			
		}
	}

}
