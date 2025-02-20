public class assignOp {
    
        public static void main(String[] args) {
            int a = 10;
            int b = 5;
            System.out.println("Simple Assignment a = " + a);
            a += b; 
            System.out.println("Add and Assignment: a += b -> a = " + a); 
            a -= b; 
            System.out.println("Subtract and Assignment: a -= b -> a = " + a);
            a *= b; 
            System.out.println("Multiply and Assignment: a *= b -> a = " + a);
            a /= b; 
            System.out.println("Divide and Assignment: a /= b -> a = " + a);
            a %= b; 
            System.out.println("Modulus and Assignment: a %= b -> a = " + a);
            a <<= 2; 
            System.out.println("Left Shift and Assignment: a <<= 2 -> a = " + a);
            a >>= 2; 
            System.out.println("Right Shift and Assignment: a >>= 2 -> a = " + a);
            a &= b; 
            System.out.println("Bitwise AND and Assignment: a &= b -> a = " + a);
            a |= b; 
            System.out.println("Bitwise OR and Assignment: a |= b -> a = " + a);
            a ^= b; 
            System.out.println("Bitwise XOR and Assignment: a ^= b -> a = " + a);
        }
    }

