package kablewie;

/**
* @file Human.java
* @author Aled
* @date 04 Dec 2015
* @see Game.java, Board.java, and Scoreboard.java for related information.
*
* Handles player actions.
*/
public class Human{
    private String m_name;
    private Board m_board;
    private Scoreboard m_scoreboard;
    private Game m_game;
    
    /**
     * A constructor taking two arguments and returning a new instance of Human
     * @param name is the name of the player.
     * @param g an instance of the object Game.class.
     * @return New human(player) object
     */
    public Human (String name, Game g){
        m_name = name ;
        m_game = g;
        m_board = g.getBoard();
        m_scoreboard = g.getScoreboard();
        
        takeTurn();
    }
    
	/**
	* An accessor method taking in no
	* arguments and returning the the player's name
	* @return Value of n_name
	*/
    public String getName (){
        return m_name;
    }
    
    /**
	* An assigning method taking in one argument and setting it as m_name.
	* @param n a string
	*/
    public void setName (String n) {
        m_name = n;
    }
    
    /**
	* A method that keeps track of the player and his progress
	*/
    public void takeTurn() {
        m_scoreboard.update();
        
        if(m_board.isGameOver()){
            m_game.endGame('l');
        } 
    }
}