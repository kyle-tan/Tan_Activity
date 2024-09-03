package Tan_L31Activity1;

public class Tan_L31Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Kyle Daeniel D. Tan";
		int age = 23;
		String country = "Philippines";
		String sport = "Basketball";
		double hours = 2.5;
		String game = "Wordscapes";
		String subject = "Math";
		int grade = 95;
		
//		System.out.println("My name is " +name+ ". I'm " +age+" years old and from the "+country);
//		System.out.println("My favorite sport is "+sport+". I play for "+hours+" hour(s) a day.");
//		System.out.println("I like to play "+game+ " when I'm tired.");
//		System.out.println("In school, my favorite subject was " +subject+". I scored a "+grade+".");
		System.out.printf("My name is %s. I'm %d years old and from the %s. %n",name,age,country);
		System.out.printf("My favorite sport is %s. I play for %.2f hour(s) a day. %n",sport, hours);
		System.out.printf("I like to play %s when I'm tired. %n", game);
		System.out.printf("In school, my favorite subject was %s. I scored a %d.", subject, grade);
	}

}
