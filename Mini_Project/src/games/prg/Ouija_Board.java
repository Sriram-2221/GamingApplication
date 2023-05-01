package games.prg;

import java.util.*; 

public class Ouija_Board extends Rock_Paper_Scissors {

	public static void execute3() {
		// TODO Auto-generated method stub
		System.out.println("OUIJA BOARD");
    	System.out.println("||||||||||||||||||||||||||||||||||WELCOME TO THE GATE OF HELL||||||||||||||||||||||||||||||||||||");
    	System.out.println("this game can call any ghost by LORD OROCHIMARU'S summoning jutsu");
    	System.out.println("ask your questions");
        while(true) {
        	Scanner sc = new Scanner(System.in);
        	Random ram = new Random();
        	String str = sc.nextLine();
        	int age = ram.nextInt(100);
        	
        	String[] que1 = {"behind u","on your left","above u"};
        	String[] que2 = {"rose","kaaviyaa","priya","dhivya","kavitha","ranjini","monika","jayashree","devi","surthi","srinisha"};
        	String[] que3 = {"good","bad :-)"};
        	String[] que4 = {"single","comitted"};
        	String[] que5 = {"lonely","feeling sad"};
        	String[] que6 = {"die for me","get the hell out of here"};
        	String[] que7 = {"accident","sucide","murdered","illness"};
        	String[] que8 = {"yes","no"};
        	
        	if(str.equals("is there anyone") || str.equals("anyone here") || (str.equals("where are you")))
        	System.out.println("ghost: "+ que1[ram.nextInt(que1.length)]);
        	else if(str.equals("what is your name") || str.equals("about u"))
        		System.out.println("ghost; "+que2[ram.nextInt(que2.length)]);
        	else if(str.equals("good spirit or bad spirit") || str.equals("are u good spirit or bad spirit"))
        		System.out.println("ghost; "+que3[ram.nextInt(que3.length)]);
        	else if(str.equals("are u single or comitted") || str.equals("are u single"))
        		System.out.println("ghost; "+que4[ram.nextInt(que4.length)]);
        	else if(str.equals("how old are you") || str.equals("are you old") || str.equals("are you young") || str.equals("what is your age")) 
        	    System.out.println("i am " + age +" years old");
        	else if(str.equals("how many people are in this room") || str.equals("how many ghost with you"))
        		System.out.println(age);
        	else if(str.equals("how do you feel") || str.equals("right now what is your feeling"))
        		System.out.println("ghost; "+que5[ram.nextInt(que5.length)]);
        	else if(str.equals("what do you want") || str.equals("do you want me to do anything for you"))
        		System.out.println("ghost; "+que6[ram.nextInt(que6.length)]);
        	else if(str.equals("how you died") || str.equals("tell about your death"))
        		System.out.println("ghost; "+que7[ram.nextInt(que7.length)]);
        	else if(str.equals("are you alone") || str.equals("anyone with you"))
        		System.out.println("ghost; "+que8[ram.nextInt(que8.length)]);
        	else if(str.equals("bye")) {
        	System.out.println("you are going to feel really bad:-)\nbye");
        	break;
        	
        	
        	}
        	else {
        		System.out.println("Don't ask unwanted questions");
        	}
        }
	}

}
