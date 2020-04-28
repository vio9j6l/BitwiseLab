public class Main
{
    public static void main(String[] args) {
        int x = 35;

        // Check the 4th bit of x
        // 16 == 010000
        // 35 == 100011
        // && || is logical operator
        // & | is bitwise operator

        if ((x & 16) == 010000) {
            System.out.println("4th bit is set");
        } else {
            System.out.println("4th bit is Not set");
        }

        // Check the 5th bit of x
        // 32 = 100000
        if ((x & 32) == 32) {
            System.out.println("5th bit is set");
        } else {
            System.out.println("5th bit is Not set");
        }

        // 16 == 010000
        // 32 = 100000

        // Check the 4th and 5th bit of x
        // 35 = 100011
        // 48 = 110000 checking
        // 32   100000
        if ((x & 48) == 48) { //is 32, not 48
            System.out.println("Both bits are set");
        } else {
            System.out.println("One or both are Not set");
        }


        int bits = 16|32; // 16 + 32
        if ((x & bits) == bits) { //is 32, not 48
            System.out.println("Both bits are set");
        } else {
            System.out.println("One or both are Not set");
        }
    }
}
