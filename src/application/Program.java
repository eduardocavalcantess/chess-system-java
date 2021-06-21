package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;

public class Program {

	public static void main(String[] args) {
		ChessMatch cheesMatch = new ChessMatch();
		UI.printBoard(cheesMatch.getPieces());
	}

}
