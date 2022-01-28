
import java.util.*;
import java.util.Random;


public class RSPgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Random rand = new Random();
		        System.out.println("Let's play ");
		        int countc=0,countu=0;
		       
		        for (int i=1;i<=5;i++){
		            
		        System.out.println("Enter 0 for Rock or 1 for paper or 2 for scissor");
		        int rand1 = rand.nextInt(3);
		   
		        int input =sc.nextInt();

		     System.out.println("Computer Input is "+rand1);
		        
		       if(rand1==input){
		           continue;
		       }
		       else if((rand1==0 && input==2)||(rand1==2 && input==1)||(rand1==1 && input==0)){
		            countc++;
		       }
		       else{
		           countu++;
		       }
		    }
            sc.close();
		    if(countc>countu){
		        System.out.println("Computer Wins ");
		    }
		    else if (countc==countu){
		        System.out.println("Its a tie ");
		    }
		    else{
		        System.out.println("You Win ");
		    }
		}
		

	}


