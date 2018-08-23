package chapter_8;
//Filename: BowlingTeamDemo.java
//Written by: Jon O'Dowd
//Written on: 08/05/2018

import java.util.*;
public class BowlingTeamDemo 
{
	public static void main(String[] args) 
	{
		String name;
		BowlingTeam bowlTeam = new BowlingTeam();
		int x;
		final int NUM_TEAM_MEMBERS = 4;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter team name...");
		name = input.nextLine();
		bowlTeam.setTeamName(name);
		
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			System.out.println("Enter team members' name>>");
			name = input.nextLine();
			bowlTeam.setMember(x, name);
		}
		System.out.println("\nMembers of team " + bowlTeam.getTeamName());
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			System.out.print(bowlTeam.getMember(x) + " ");
		System.out.println();
		
	}

}
