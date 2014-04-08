/**
 * 
 */
package br.edu.metrocamp.chess.board;

import java.util.ArrayList;

import br.edu.metrocamp.chess.piece.Coordinate;
import br.edu.metrocamp.chess.piece.Piece;

/**
 * @author lucasmo
 *
 */
public class Board
{
	public final int board_size = 8;
	
	private Piece[][] chessBoard = new Piece[board_size][board_size];
	
	public Board(ArrayList<Piece> pieceList)
	{
		for (int x = 0; x < board_size; x++)
		{
			for (int y = 0; y < board_size; y++)
			{
				chessBoard[x][y] = null;
			}
		}
		
		for (Piece piece : pieceList)
		{
			chessBoard[piece.getCoord().getCoord_x()][piece.getCoord().getCoord_y()] = piece;
		}
	}
	
	public Piece getPiece(int x, int y)
	{
		return chessBoard[x][y];
	}
	
	public Piece getPiece(Coordinate coord)
	{
		return chessBoard[coord.getCoord_x()][coord.getCoord_y()];
	}
	
	public void setPiece(Piece piece, int x, int y)
	{
		chessBoard[x][y] = piece;
	}
	
	public void setPiece(Piece piece, Coordinate coord)
	{
		chessBoard[coord.getCoord_x()][coord.getCoord_y()] = piece;
	}
	
	public void draw()
	{
		
	}
}
