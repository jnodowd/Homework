package chapter_8;
//Filename: BowlingTeamDemo4.java
//Written by: Jon O'Dowd
//Written on: 08/05/2018

import java.util.*;
public class BowlingTeamDemo4 
{
	public static void main(String[] args) 
	{
		String name;
		final int NUM_TEAMS = 4;
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		Scanner input = new Scanner(System.in);
		getTeamData(teams);
		
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			System.out.println("\nMembers of team " + teams[y].getTeamName());
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
				System.out.print(teams[y].getMember(x) + " ");
			System.out.println();
		}
		System.out.print("\n\nEnter a team name to see its roster >> "); 
		name = input.nextLine();
		for(y = 0; y < teams.length; ++y) 
			if(name.equals(teams[y].getTeamName())) 
				for(x = 0; x < NUM_TEAM_MEMBERS; ++x) 
					System.out.print(teams[y].getMember(x) + " ");
		System.out.println();
		
		
	}
	public static void getTeamData(BowlingTeam[] teams) 
	{ 
		String name;
		final int NUM_TEAMS = 4;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		Scanner input = new Scanner(System.in);
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			teams[y] = new BowlingTeam();
			System.out.println("Enter team name...");
			name = input.nextLine();
			teams[y].setTeamName(name);
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.println("Enter team members' name>>");
				name = input.nextLine();
				teams[y].setMember(x, name);
			}
		}
	}

}
