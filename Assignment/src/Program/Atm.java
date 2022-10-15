package Program;

 class withdraw
 {
	
	int Amt_draw = 1000;
	void show ()
	{
		System.out.println("super class");
	}
 }
public class Atm extends withdraw{
	int Amt_left = 15000;
	void show()
	{
		super.show();
		System.out.println("child class");
	}
	public static void main(String[] args)
	{
     Atm ob = new Atm();
     ob.show();
	}

}
