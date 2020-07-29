/*Write a program to design a Dice game. There should be two players. Ask the users to enter their names and roll the dice(four times each). Display the scores and calculate the final score and print the name of the winner*/


import java.util.Scanner; 
import java.util.HashMap;
import java.util.Map;

public class RollTheDice {
   
 
    public static void main(String[] args) {
    
        int die1=0;   // The number on the first die.
        int die2=0;   // The number on the second die.
	int die3=0;   //
	int die4=0;   //
        int roll1=0;   // The total roll (sum of the two dice).
	int roll2=0;
	int roll3=0;
	int roll4=0;        
	int large;
	 Scanner sc = new Scanner(System.in); 
	Map map1 = new HashMap();
	Map map2 = new HashMap();
	Map map3 = new HashMap();
	Map map4 = new HashMap();	
	System.out.println("Enter Name 1");
	String name1= sc.nextLine();
	System.out.println("Enter Name 2");
	String name2= sc.nextLine();
	System.out.println("Enter Name 3");
	String name3 = sc.nextLine();
	System.out.println("Enter Name 4");
	String name4 = sc.nextLine();
	
	for(int i=0;i<=3;i++)
	{
        	die1 = (int)(Math.random()*6) + 1;
		System.out.println(name1+" die comes up " + die1);
        	die2 = (int)(Math.random()*6) + 1;
		System.out.println(name2+" die comes up " + die2);  //calculating die number
		die3 = (int)(Math.random()*6) + 1;
		System.out.println(name3+" die comes up " + die3);
		die4 = (int)(Math.random()*6) + 1;
		System.out.println(name4+" die comes up " + die4);
		roll1=roll1+die1;
		roll2=roll2+die2;
		roll3=roll3+die3;
		roll4= roll4+die4;
       	}
        
       
        System.out.println("Your total roll is " + roll1);
System.out.println("Your total roll is " + roll2);     //suming up
System.out.println("Your total roll is " + roll3);
System.out.println("Your total roll is " + roll4);

	map1.put(name1, roll1);
	map2.put(name2, roll2);
	map3.put(name3, roll3);
	map4.put(name4, roll4);

System.out.println(map1);
System.out.println(map2);
System.out.println(map3);
System.out.println(map4);

large=(roll1>roll2)?(roll1>roll3)?(roll1>roll4)?roll1:roll4:(roll3>roll4)?roll3:roll4:(roll2>roll2)?(roll2>roll4)?roll2:roll4:(roll3>roll4)?roll3:roll4;  //tofind larger

System.out.println("The largest sum is  " + large);

	

    }  // end main()
 
}  // end class