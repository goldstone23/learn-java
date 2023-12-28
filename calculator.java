import java.util.Scanner;                                                                                                                                                                                 
class calcu                                                                                                                                                                                               
{                                                                                                                                                                                                         
	public static void main(String[]args) {                                                                                                                                                               
		int p1, p2,ph,cal;                                                                                                                                                                                
		System.out.println("enter kro koi do no : ");                                                                                                                                                     
		Scanner r = new Scanner(System.in);                                                                                                                                                               
		p1 = r.nextInt();                                                                                                                                                                                 
		p2 = r.nextInt();                                                                                                                                                                                 
		System.out.println("opration lgao :");                                                                                                                                                            
		ph = r.nextInt();                                                                                                                                                                                 
		                                                                                                                                                                                                  
		                                                                                                                                                                                                  
		if(ph == 1)                                                                                                                                                                                       
		{                                                                                                                                                                                                 
			cal = p1+p2;                                                                                                                                                                                  
			System.out.print("add" + cal);                                                                                                                                                                
		}                                                                                                                                                                                                 
			                                                                                                                                                                                              
		else if (ph ==2)                                                                                                                                                                                  
		{                                                                                                                                                                                                 
			cal = p1-p2;                                                                                                                                                                                  
			System.out.println("sub" +cal);                                                                                                                                                               
		                                                                                                                                                                                                  
		}                                                                                                                                                                                                 
		else if (ph ==3)                                                                                                                                                                                  
		{                                                                                                                                                                                                 
			cal = p1*p2;                                                                                                                                                                                  
			System.out.print("multi" +cal);                                                                                                                                                               
		                                                                                                                                                                                                  
		}                                                                                                                                                                                                 
		else if (ph ==4)                                                                                                                                                                                  
		{                                                                                                                                                                                                 
			cal = p1/p2;                                                                                                                                                                                  
			System.out.print("divide"+cal);                                                                                                                                                               
		                                                                                                                                                                                                  
		}                                                                                                                                                                                                 
		else                                                                                                                                                                                              
		 {                                                                                                                                                                                                
			cal = p1%p2;                                                                                                                                                                                  
			System.out.print("remainder"+cal);                                                                                                                                                            
		}                                                                                                                                                                                                 
	}                                                                                                                                                                                                     
}		                                                                                                                                                                                                  
                                                                                                                                                                                                          
                                                                                                                                                                                                          
