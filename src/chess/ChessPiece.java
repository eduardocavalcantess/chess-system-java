package chess;

import boardgame.Board;
import boardgame.Piece;

//Regra - Pe�a de Xadrez
public class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
