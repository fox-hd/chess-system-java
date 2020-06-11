package application;

import chess.ChessPiece;
//classe interface do usuario
public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {//imprimi o tabuleiro com as pe�as em suas posi��es
		for( int i=0; i<pieces.length; i++) {
			System.out.print((8-i)+ " " );
			for( int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);//chama o metodo responsavel por imprimir as pe�as				
			}
			System.out.println();
		}
		System.out.print("  a b c d e f g h");
		
	}
	
	private static void printPiece(ChessPiece piece) {//imprimi cada posicao do tabuleiro verificando se esta ocupada por pe�as ou nao
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}

}
