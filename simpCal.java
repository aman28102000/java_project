
		package arithmeticCalculator;

		import java.util.Scanner;

		public class calculator{
			
			public static void main(String[] args) {
				
				char operator;
			    double num1,num2,ans;
			    
			    Scanner scn=new Scanner(System.in);
			    System.out.println("Enter first number");
			    num1 = scn.nextDouble();
			    
				System.out.println("Enter second number");
				num2 = scn.nextDouble();
			    
			    System.out.println("Select an operator: +, -, *, or /");
			    operator = scn.next().charAt(0);
			     
			    
			    switch (operator) {
			    
			    case '+':
			        ans = num1 + num2;
			        System.out.println(num1 + " + " + num2 + " = " + ans);
			        break;
			        
			    case '-':
			        ans = num1 - num2;
			        System.out.println(num1 + " - " + num2 + " = " + ans);
			        break;
			        
			    case '*':
			        ans = num1 * num2;
			        System.out.println(num1 + " * " + num2 + " = " + ans);
			        break;
			        
			    case '/':
			        ans = num1/ num2;
			        System.out.println(num1 + " / " + num2 + " = " + ans);
			        break;
			        
			    default:
			        System.out.println("Invalid operator!");
			        break;
			    }
			  
			}

		}


