package chapter_8;
//Filename: BowlingTeam.java
//Written by: Jon O'Dowd
//Written on: 08/05/2018

public class BowlingTeam 
{
	private String teamName;
	private String[] members = new String[4];
	
	public String getTeamName() 
	{
		return teamName;
	}
	public void setTeamName(String teamName) 
	{
		this.teamName = teamName;
	}
	public void setMember(int number, String name)
	{
		this.members[number] = name;
	}
	public String getMember(int number)
	{
		return members[number];
	}

	
}
