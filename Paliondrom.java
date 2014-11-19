import java.util.Scanner;

/** Ispitadi da li je broj paliondrom
 * 
 * @author Vedad
 *
 */

public class Paliondrom {
	public static void main(String[] args) {
	
	    int broj, reverse = 0;
	   
	      System.out.println("Unesite broj");
	      Scanner in = new Scanner(System.in);
	      broj = in.nextInt();
	      int x = broj;
	      while( broj != 0 )
	      {
	    	  
	          reverse = reverse * 10;
	          reverse = reverse + broj%10;
	          broj = broj/10;
	      }
	 
	     if(reverse==x){
	    	 System.out.println("Broj je paliondrom " );
	    	 
	     }
	     else{
	    	 System.out.println("Broj nije paliondrom " );
	     }
	   }
	}