public class literals {

        public static void main(String[] args) {
            int bin1 = 0b1010;    // Binary literal for decimal 10
            int bin2 = 0B1101;    // Binary literal for decimal 13
            int bin3 = 0b11111111; // Binary literal for decimal 255 (8 bits)
            System.out.println("*************Binary Literal****************");
            System.out.println("Binary literal 0b1010 (decimal 10): " + bin1);
            System.out.println("Binary literal 0B1101 (decimal 13): " + bin2);
            System.out.println("Binary literal 0b11111111 (decimal 255): " + bin3);
            System.out.println("*************Integer Literal************");
            int decimal = 10;        // Decimal literal
            int binary = 0b1010;     // Binary literal (prefix 0b or 0B)
            int octal = 012;         // Octal literal (prefix 0)
            int hex = 0xA;           // Hexadecimal literal (prefix 0x or 0X)
            System.out.println("Decimal literal: " + decimal);
            System.out.println("Binary literal: " + binary);
            System.out.println("Octal literal: " + octal);
            System.out.println("Hexadecimal literal: " + hex);
            System.out.println("*************Floating Point Literal************");
            float floatLiteral = 10.5f;    // Floating-point literal (suffix 'f' or 'F')
            double doubleLiteral = 10.5;   // Double-precision floating-point literal (default type)
            double expLiteral = 1.05e2;    // Exponential notation (1.05 * 10^2)
            System.out.println("Float literal: " + floatLiteral);
            System.out.println("Double literal: " + doubleLiteral);
            System.out.println("Exponential literal: " + expLiteral);
            System.out.println("*************Character Literal************");
            char ch1 = 'A';        // Character literal
            char ch2 = '\u0041';   // Unicode representation (A)
            char ch3 = '\n';       // Escape sequence (newline)
            System.out.println("Character literal: " + ch1);
            System.out.println("Unicode character literal: " + ch2);
            System.out.println("Escape sequence (newline): ");
            System.out.print(ch3);  // Prints a new line
            System.out.println("*************String Literal************");
            String str1 = "Hello, World!";  // String literal
            String str2 = "123";            // String containing numbers
            System.out.println("String literal: " + str1);
            System.out.println("String containing numbers: " + str2);
            System.out.println("*************Boolean Literal************");
            boolean bool1 = true;    // Boolean literal (true)
            boolean bool2 = false;   // Boolean literal (false)
            System.out.println("Boolean literal true: " + bool1);
            System.out.println("Boolean literal false: " + bool2);
            System.out.println("*************Null Literal************");
            String str = null;   // Null literal
            if (str == null) {
                System.out.println("Null literal: The string is null.");
            }
        }
    }

