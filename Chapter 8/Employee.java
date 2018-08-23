package chapter_8;

public class Employee 
{
	private int empNum;
	private double empSal;
	
	Employee(int e, double s)
	{
		empNum = e;
		empSal = s;
	}
	public int getEmpNum()
	{
		return empNum;
	}
	public void setEmpNum(int en)
	{
		empNum = en;
	}
	public double getempSal()
	{
		return empSal;
	}
	public void setTempSal(double es)
	{
		empSal = es;
	}

}
