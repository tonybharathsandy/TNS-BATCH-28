package Program;

public class Dasarath {
		void display1()
		{
			System.out.println("I am the Grandfather");
			
		}

	}
	class Rama extends Dasarath
	{
		void display2()
		{
			System.out.println("I am the Father");
		}
	}
	class Lava extends Rama{
		void display3()
		{
			System.out.println("I am the Grandson");
			
		}
	}

