/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in editor.
 */
package objects;
import java.util.Random;

/**
 *
 * @author Prashanth Reddy Nachannagari
 */
public class StringsAndNumbers {
    
      public static void main(String[] args) {
        // TODO code application logic here
        String string1="   How    ";
        String string2="Applied     ";
        String string3="   Computer Science?";
        String string4="is";
        String string5="different";
        String string6="from";
         
        String k= string1.concat(string2).concat(string3.substring(0,string3.indexOf("?"))).concat(string4).concat(string5).concat(string6).concat(string3);
      
        System.out.println("******** String Class ********\n");  
        
        System.out.println(k);
        
        System.out.println("The length of the concatenated string is : "+k.length());
        
        String m=string1.trim().concat(" ").concat(string2.trim()).concat(" ").concat(string3.substring(0,string3.indexOf("?")).trim()).concat(" ").concat(string4).concat(" ").concat(string5).concat(" ").concat(string6).concat(" ").concat(string3.trim());
       
        System.out.println(m);
       
        System.out.println("The length of trimmed string is : "+m.length());
       
       
        String l=m.substring(m.indexOf("Applied"),m.indexOf("Applied")+("Applied Computer Science".length()));
         
         System.out.println(l);
         
         System.out.println(l.toUpperCase());
         
         System.out.println("The last appearance of 'C' in Applied Computer Science word is :"+l.lastIndexOf("c"));
      
          
         String s3="Once_a_Bearcat_Always_a_Bearcat!";
         
         System.out.println("Once_a_Bearcat_Always_a_Bearcat!");
         
         String rep=s3.replaceAll("_"," ");
         
         System.out.println(rep);
         
         String s4="computer Applied science Applied Computer science science Applied computer Appleid computer Science Applied computer Applied";

         System.out.println("The first occurrence of word Computer is: "+s4.lastIndexOf("Computer"));
         
         System.out.println("The main difference between both is Computer Science mainly focusses on technical skills and computer science theories, whereas Applied computer science focusses mainly on IT management roles, communication,decision making and business strategy.\n");
         
         
         System.out.println("******** Math Class ********\n");
      
         int value1=18,value2=5;
         
         double result=Math.pow(value1,value2);
         
         System.out.println("18 power 5 is : "+result);
         
         double z=1/Math.cos(value1);
       System.out.println("Secant of 18 is : "+z);
       
       double myNumber=49.77;
       
      System.out.println("Square root of 49.77 is:"+Math.sqrt(myNumber));
      
      System.out.println("Ceil value 49.77 is:"+Math.ceil(myNumber));
      
      System.out.println("Floor value 49.77 is:"+Math.floor(myNumber));
         
      System.out.println("Theoretical value of tan(90) is:"+Math.tan(90));
      
      double x = Math.tan(90);
      
      System.out.println("Cubic root of modulus value of tan(90) is:"+Math.cbrt(Math.abs(x)));    
      
      System.out.println("Sine of 60 is: "+Math.sin(60));
      
      System.out.println("Cosine of 60 is: "+Math.cos(60));
      
      double i=Math.sin(60);
      
      double j=Math.cos(60);
      
      System.out.println("Minimum value in Sin(60) and Cos(60) is: "+Math.min(i,j));
      
      int myNumber1=27,myNmuber2=45;
      
      System.out.println("Cosine of 27 is: "+Math.round(Math.cos(myNumber1)));
      
      System.out.println("Cosine of 45 is: "+Math.round(Math.cos(myNmuber2)));
      
      System.out.println("Tangent of 27 is: "+Math.round(Math.tan(myNumber1)));
      
      System.out.println("Tangent of 45 is: "+Math.round(Math.tan(myNmuber2)));
      
      
      
      double c=Math.pow(((Math.pow(7,2)+(6*2*5)+3)),1.0/4.0);
      double d=Math.pow((Math.pow(6,3))-(Math.pow(3,4)),1.0/7.0);
      
      double e=c/d; 
      double f= Math.abs(3*(1/Math.sin(45)));
      
      double res= f*e;
              
      System.out.println("The value of the given equation is:"+res);    
      
      System.out.println("\n");
      
      System.out.println("******** Random Class ********\n");
      
      Random rand = new Random(); 
       int first = rand.nextInt(300);
       int second = rand.nextInt(300);
       int third = rand.nextInt(300);
       int fourth = rand.nextInt(300);
       
       
      System.out.println("4 pseudo-random integer values between 0 (inclusive) and 300 (exclusive)");
      
      System.out.println("\n");
      
      System.out.println("First random integer value is:"+first);
      
      System.out.println("Second random integer value is:"+second);
      
      System.out.println("Third random integer value is:"+third);
      
      System.out.println("Fourth random integer value is:"+fourth); 
      
      
       int fifth = rand.nextInt();
       int sixth = rand.nextInt();
       int seventh = rand.nextInt();
      
       System.out.println("\n");
       
       System.out.println("3 pseudo-random integer values without seed value and bounds");
       
       System.out.println("\n");
       
       System.out.println("fifth random integer value is:"+fifth);
      
       System.out.println("Sixth random integer value is:"+sixth);
      
       System.out.println("Seventh random integer value is:"+seventh);
       
       System.out.println("\n");
       
       System.out.println("No, I didnt get same answers each time when I run the program. Also I got 10 didgit numbers including negative when I didnt give any integer value");
       
       System.out.println("\n");
       
       Random ra = new Random(); 
       ra.setSeed(10L);
       int fi = ra.nextInt(300);
       int se = ra.nextInt(300);
       int th = ra.nextInt(300);
       int fo = ra.nextInt(300);
       
       
      System.out.println("4 pseudo-random long values between 0 (inclusive) and 300 (exclusive)");
      
      System.out.println("\n");
       
      System.out.println("First random integer value is:"+fi);
      
      System.out.println("Second random integer value is:"+se);
      
      System.out.println("Third random integer value is:"+th);
      
      System.out.println("Fourth random integer value is:"+fo); 
      
      
       int fif = ra.nextInt();
       int six = ra.nextInt();
       int sev = ra.nextInt();
      
        System.out.println("\n");
       
       System.out.println("3 pseudo-random long values with seed value and without bounds");
       
       System.out.println("\n");
       
       System.out.println("Fifth random integer value is: "+fif);
      
       System.out.println("Sixth random integer value is: "+six);
      
       System.out.println("Seventh random integer value is: "+sev);
       
       System.out.println("\n");
       
       System.out.println("Yes, I got same answers after everytime I run in both the cases when I gave seed value.\n");
       
       System.out.println("The difference between both is when I generate the numbers without seed value I was getting different numbers each time when I run. But when I gave seed value , I was getting same numbers in both cases each time I run");
        
      
              }

}
