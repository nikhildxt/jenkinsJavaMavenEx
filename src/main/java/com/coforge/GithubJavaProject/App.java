package com.coforge.GithubJavaProject;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Player p = new Player(10, "sachin", "maharastra");
		
		System.out.println(p.getPlayerNo() + ": "+ p.getPlayerName()+ ": "+ p.getState());
    }
}
