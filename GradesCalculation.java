import acm.program.ConsoleProgram;


public class GradesCalculation  extends ConsoleProgram
{
	public void run()
	{
		
		println("Grades Calculations");
		int numStudents = readInt("How many students? ");
		double[] grades = getGrades(numStudents);
		
		while(true)
		{
			String command = getCommand();
				
				if(command.equals("a"))
				{
					println("Average: " + getAverage(grades));
				}
			
				else if(command.equals("m"))
				{
					println("Max: " + getMax(grades));
				}
			
				else if(command.equals("-"))
				{
					println("Min: " + getMax(grades));
				}
				
				else if(command.equals("q"))
				{
					break;
				}
		}
		
	}
	
	public String getCommand()
	{
		println("What do you want to do?");
		return readLine("(A)verage, (M)ax, (-)Min, (Q)uit: ").toLowerCase().trim();
		
	}
	
	public double[] getGrades(int numStudents)
	{
		
		double[] grades = new double[numStudents];
		
		return grades;
	}
	
	public double getAverage(double[] items)
	{
		
		return 0;
		
	}
	
	public double getMax(double[] items)
	{
		
		return 0;
		
	}
	
	public double getMin(double[] items)
	{
		
		return 0;
		
	}
	
	
	
	
	
	
}
