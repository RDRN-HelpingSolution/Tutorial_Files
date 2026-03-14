package Units.Lecture_7;

import java.util.Date;
import java.util.Locale;

public class UltimateStringMaster {

    // ===== FINAL CLASS EXAMPLE =====
    final static class FinalClass {
        final int constant = 100;

        final void show() {
            System.out.println("Inside final method");
        }
    }

    public static void main(String[] args) {

        // =====================================================
        System.out.println("========== 1. STRING MEMORY ==========");

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        String s5 = s3.intern();
        System.out.println("s1 == s5 (interned): " + (s1 == s5));


        // =====================================================
        System.out.println("\n========== 2. IMMUTABILITY ==========");

        String original = "Hello";
        original.concat(" World");
        System.out.println("After concat (not stored): " + original);

        original = original.concat(" World");
        System.out.println("After concat (stored): " + original);


        // =====================================================
        System.out.println("\n========== 3. STRING METHODS ==========");

        String s = "  Java Programming  ";
        String s6 = "JAVA";
        String s7 = "Java";
        String csv = "Java,Python,C++";

        // 1️⃣ Information Methods
        System.out.println("Length: " + s.length());              // 20
        System.out.println("Is Empty: " + s.isEmpty());           // false
        System.out.println("Is Blank: " + "   ".isBlank());       // true

        // 2️⃣ Character Access
        System.out.println("Char at index 2: " + s.charAt(2));    // J
        char[] arr = s.toCharArray();
        System.out.println("First char from array: " + arr[3]);   // a

        // 3️⃣ Comparison
        System.out.println("Equals: " + s7.equals(s6));           // false
        System.out.println("Equals Ignore Case: " + s7.equalsIgnoreCase(s6)); // true
        System.out.println("CompareTo: " + s7.compareTo(s6));

        // 4️⃣ Searching
        System.out.println("Contains 'Java': " + s.contains("Java"));
        System.out.println("IndexOf 'Prog': " + s.indexOf("Prog"));
        System.out.println("LastIndexOf 'a': " + s.lastIndexOf('a'));

        // 5️⃣ Prefix / Suffix
        System.out.println("StartsWith Java: " + s.trim().startsWith("Java"));
        System.out.println("EndsWith ming: " + s.trim().endsWith("ming"));

        // 6️⃣ Extraction
        System.out.println("Substring: " + s.substring(2,6)); // Java

        // 7️⃣ Concatenation
        String concat = "Java".concat(" Developer");
        System.out.println("Concat: " + concat);

        // 8️⃣ Replacement
        System.out.println("Replace a->o: " + s.replace('a','o'));
        System.out.println("Replace First: " + s.replaceFirst("Java","Python"));
        System.out.println("Replace All spaces: " + s.replaceAll(" ","_"));

        // 9️⃣ Case Conversion
        System.out.println("UpperCase: " + s.toUpperCase());
        System.out.println("LowerCase: " + s.toLowerCase());

        // 🔟 Whitespace Handling
        System.out.println("Trim: '" + s.trim() + "'");
        System.out.println("Strip: '" + s.strip() + "'");

        // 1️⃣1️⃣ Splitting
        String[] languages = csv.split(",");
        for(String lang : languages) {
            System.out.println("Language: " + lang);
        }

        // 1️⃣2️⃣ Pattern Matching
        System.out.println("Matches regex: " + "abc123".matches("[a-z]+\\d+"));

        // 1️⃣3️⃣ Repetition
        System.out.println("Repeat: " + "Hi ".repeat(3));

        // 1️⃣4️⃣ Conversion
        String number = String.valueOf(100);
        System.out.println("ValueOf: " + number);

        // 1️⃣5️⃣ Join
        String joined = String.join("-", "A","B","C");
        System.out.println("Join: " + joined);

        // 1️⃣6️⃣ Formatting
        String formatted = String.format("Age: %d", 25);
        System.out.println(formatted);

        // 1️⃣7️⃣ String Pool Method
        String pooled = new String("Java").intern();
        System.out.println("Interned String: " + pooled);

        // 1️⃣8️⃣ Lines Method
        String multiline = "Hello\nWorld\nJava";
        multiline.lines().forEach(System.out::println);

        // 1️⃣9️⃣ Hash Code
        System.out.println("HashCode: " + s.hashCode());
    


        // =====================================================
        System.out.println("\n========== 4. STRING CONCAT (+) ==========");

        String a = "Java";
        String b = "SE";
        String c = a + b;
        System.out.println("Concatenated: " + c);


        // =====================================================
        System.out.println("\n========== 5. COMPLETE STRING FORMAT ==========");

        int num = 255;
        double pi = 3.1415926535;
        String text = "Java";
        boolean flag = true;
        Date now = new Date();

        System.out.println("----- GENERAL -----");
        System.out.printf("Boolean: %b%n", flag);
        System.out.printf("Hashcode: %h%n", text);
        System.out.printf("String: %s%n", text);
        System.out.printf("Upper String: %S%n", text);
        System.out.printf("Character: %c%n", 'A');
        System.out.printf("Percent: %% %n");
        System.out.printf("New Line test%n");

        System.out.println("\n----- INTEGER -----");
        System.out.printf("Decimal: %d%n", num);
        System.out.printf("Octal: %o%n", num);
        System.out.printf("Hex lower: %x%n", num);
        System.out.printf("Hex upper: %X%n", num);

        System.out.println("\n----- FLOAT -----");
        System.out.printf("Float: %f%n", pi);
        System.out.printf("2 decimal: %.2f%n", pi);
        System.out.printf("Scientific: %e%n", pi);
        System.out.printf("Shortest: %g%n", pi);
        System.out.printf("Hex float: %a%n", pi);

        System.out.println("\n----- WIDTH & FLAGS -----");
        System.out.printf("Width 10: %10d%n", num);
        System.out.printf("Left justify: %-10dEND%n", num);
        System.out.printf("Zero pad: %010d%n", num);
        System.out.printf("Show sign: %+d%n", num);
        System.out.printf("Negative parentheses: %(d%n", -100);
        System.out.printf("Comma separator: %,d%n", 1000000);
        System.out.printf("Alternate form hex: %#x%n", num);

        System.out.println("\n----- ARGUMENT INDEX -----");
        System.out.printf("Second first: %2$s %1$s%n", "World", "Hello");

        System.out.println("\n----- DATE & TIME -----");
        System.out.printf("Full date: %tc%n", now);
        System.out.printf("ISO date: %tF%n", now);
        System.out.printf("US date: %tD%n", now);
        System.out.printf("Year: %tY%n", now);
        System.out.printf("Month name: %tB%n", now);
        System.out.printf("Day name: %tA%n", now);
        System.out.printf("Hour 24: %tH%n", now);
        System.out.printf("Minute: %tM%n", now);
        System.out.printf("Second: %tS%n", now);
        System.out.printf("AM/PM: %tp%n", now);

        System.out.println("\n----- LOCALE -----");
        System.out.printf(Locale.FRANCE, "French format: %,.2f%n", 1234567.89);

        String formatted1 = String.format("Name: %s, Value: %.3f", text, pi);
        System.out.println("String.format result: " + formatted1);

        // =====================================================
        System.out.println("\n========== 6. STRINGBUFFER ==========");

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        sb.insert(4," SE");
        sb.replace(0,4,"Python");
        sb.delete(6,9);
        sb.reverse();
        System.out.println("Buffer result: " + sb);
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());


        // =====================================================
        System.out.println("\n========== 7. STRINGBUILDER ==========");

        StringBuilder sbd = new StringBuilder("Java");
        sbd.append(" Developer");
        sbd.insert(4," FullStack");
        sbd.delete(0,4);
        sbd.reverse();
        System.out.println("Builder result: " + sbd);
        System.out.println("Capacity: " + sbd.capacity());
        System.out.println("Length: " + sbd.length());


        // =====================================================
        System.out.println("\n========== 8. FINAL KEYWORD ==========");

        FinalClass obj = new FinalClass();
        System.out.println("Final variable: " + obj.constant);
        obj.show();

        final int y = 20;
        System.out.println("Final local variable: " + y);

        final StringBuilder ref = new StringBuilder("Test");
        ref.append(" Changed");
        System.out.println("Final reference modified object: " + ref);

        System.out.println("\n========== END OF ULTIMATE MASTER ==========");
    }
}
