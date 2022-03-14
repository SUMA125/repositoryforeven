import java.util.Scanner;
//changed code for this program

// changes made to use pull command
class Even 

{
  public void readnum()
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Number");
	  int num=sc.nextInt();
  if(num%2==0)
	  System.out.println(+num+" is an Even Number");
  else System.out.println(+num+" is an Odd Number");
}

	public static void main(String[] args) 
	{
		Even a=new Even();
		a.readnum();
	}
}
