package boardgame;

public class Piece {
	protected Position position;//nao deve ser visivel na camada chess
	public Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;//opcional, caso n�o seja atribuida nenhuma posi��o a position, por padr�o sera null
		
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	
	
	
	
	

}
