package com.CS213.model;

import java.util.ArrayList;

public class Player {

	private ArrayList<ChessPiece> pieces;
	
	private ArrayList<ChessPiece> uncapturedPieces;

	private Player opponent;

	private King king;

	private PlayerColor color;

	public Player(PlayerColor color) {
		this.color = color;	
		pieces = new ArrayList<ChessPiece>(16);
		uncapturedPieces = new ArrayList<ChessPiece>(16);
	}

	public PlayerColor getColor() { return color; }

	public Player getOpponent() { return opponent; }

	public void addPiece(ChessPiece piece) { pieces.add(piece); } 
	
	public void addUncapturedPiece(ChessPiece piece) { uncapturedPieces.add(piece); }
	
	public void removePiece(ChessPiece piece) { uncapturedPieces.remove(piece); }

	public ArrayList<ChessPiece> getPieces() { return pieces; }
	
	public ArrayList<ChessPiece> getUncapturedPieces() { return uncapturedPieces; }

	public void setOpponent(Player opponent) { this.opponent = opponent; }

	public void setKing(King king) { this.king = king; }

	public King getKing() { return king; }

}
