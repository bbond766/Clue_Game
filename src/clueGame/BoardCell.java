package clueGame;

public class BoardCell {
	private int row;
	private int column;
	private char initial;
	private boolean isWalkway;
	private boolean isDoorway;
	private DoorDirection doorDirection;
	
	BoardCell(){
		
	}
	
	BoardCell(int row, int col, char initial, boolean isWalk, boolean isDoorway, DoorDirection dd){
		this.row = row;
		this.column = col;
		this.initial = initial;
		this.isWalkway = isWalk;
		this.isDoorway = isDoorway;
		this.doorDirection = dd;
	}
	
	public DoorDirection getDoorDirection(){
		return doorDirection;
	}
	public int getRow(){
		return row;
	}
	public char getInitial(){
		return this.initial;
	}
	public boolean isWalkway(){
		return this.isWalkway;
	}
	public boolean isRoom(){
		return false;
	}
	public boolean isDoorway(){
		System.out.println(isDoorway);
		return isDoorway;
	}
	
	
}
