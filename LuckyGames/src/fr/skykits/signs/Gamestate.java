package fr.skykits.signs;

public enum Gamestate {
	//phase
	PRELOBBY(true),
	LOBBY(true),
	PAISIBLE(false),
	PVP(false),
	RESET(false);
	
	private static Gamestate current;
	private boolean canJoin;
	
	
	Gamestate(boolean b){ 
		
		canJoin = b; 
	}
	
	public static void setState(Gamestate state){
		current = state;
	}
	
	public static boolean isState(Gamestate state){
		return current == state;
	}
	
	public static Gamestate getState(){
		return current;
	}

}