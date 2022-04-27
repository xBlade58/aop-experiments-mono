package at.fhv.se.capture_jp;

public class Game {
	String name;
	
	public static void main(String[] args) 
	{
		Game ga = new Game();	
		ga.getName();
	}
	
	public Game() 
	{
		
		this.name = "TestGame";		
	}

	
	public String getName() 
	{
		
		return name;	
		
	}
}

