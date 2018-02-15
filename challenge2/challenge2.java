   import java.util.*;
   import java.io.*;

   public class challenge2
   {
      public static void main(String []args)
      {
         Stack foo = new Stack();
         Stack bar = new Stack();
      
         Scanner scan = new Scanner(System.in);
      
         System.out.print("Enter here: ");
         String word = scan.nextLine();		
         String[] token = word.split("");
         int size = 0;
         int wlength = word.length();
      
         for(int i = 0, j = wlength; i <= wlength; i++, j--)
         {
				if(!token[i].equals(" ") ||  !token[i].equals(",")  || !token[i].equals("."))
            {	
               foo.push(token[i].toLowerCase()); 
               size++; 
            }
         
         	if(!token[j].equals(" ") ||  !token[j].equals(",")  || !token[j].equals(".") )
            { bar.push(token[j].toLowerCase()); }			
         }
      
         for(int i = size-1; i > 0; i--)
         {
            bar.pop();			
         
            if(foo.peek().equals(bar.peek()))
            { size--; }
         
            foo.pop();
         }
      
         if(size != 1)
            System.out.println(word+" is NOT a palindrome.");
         else
            System.out.println(word+" is a palindrome.");
      }
   }