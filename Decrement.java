public class Decrement {
    
        public static void main(String[] args) {
            int a = 5;
            int b = 5;

            System.out.println("Initial value of a: " + a);
            int result1 = --a; 
            System.out.println("After pre-decrement (--a):");
            System.out.println("a = " + a);
            System.out.println("result1 = " + result1);
    
             
            System.out.println("\nInitial value of b: " + b);
            int result2 = b--; 
            System.out.println("After post-decrement (b--):");
            System.out.println("b = " + b);
            System.out.println("result2 = " + result2);
        }
    }

