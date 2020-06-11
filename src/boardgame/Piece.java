package boardgame;

public class Piece {
	protected Position position;//nao deve ser visivel na camada chess
	public Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;//opcional, caso não seja atribuida nenhuma posição a position, por padrão sera null
		
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	
	
	
	
	

}
