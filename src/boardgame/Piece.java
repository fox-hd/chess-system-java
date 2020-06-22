package boardgame;

public abstract class Piece {
	protected Position position;//nao deve ser visivel na camada chess
	public Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;//opcional, caso não seja atribuida nenhuma posição a position, por padrão sera null
		
	}
 
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];		
	}
	
	public boolean isThereAnyMove() {
		boolean mat[][] = possibleMoves();
				for(int i=0;i<mat.length;i++) {
					for(int j=0;j<mat.length;j++) {
						if(mat[i][j]) {
							return true;
						}						
					}
				}
				return false;
	}
	

}
