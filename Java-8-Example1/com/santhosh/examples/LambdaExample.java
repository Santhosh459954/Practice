package com.santhosh.examples;

@FunctionalInterface
interface Calculator{
	public int operation(int a, int b);
}

public class LambdaExample {
	
	public static void main(String[] args) {
		
		//using anonymous inner class
		
		Calculator add= new Calculator() {

			@Override
			public
			 int operation(int a, int b) {
				return (a + b);
				
			}
		};
		System.out.println("The Sum of two numbers is " + add.operation(10, 20));
		
		//using lambda
		
		Calculator addLambda= (a,b) -> (a + b) ;	
	//	};
		
		System.out.println("The Sum of two numbers is " + addLambda.operation(100, 200));
	}

}
