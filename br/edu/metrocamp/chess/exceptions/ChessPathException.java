package br.edu.metrocamp.chess.exceptions;

/**
 * @author Lucas
 * @author Fabi
 * @author Vini
 * @author Marcos
 * @author Adailton
 * @category Class
 */
public class ChessPathException extends ChessException
{
	private static final long serialVersionUID = 697738302196143149L;

	public ChessPathException()
	{
		super("There are other pieces on your way! Watch out!");
	}
}