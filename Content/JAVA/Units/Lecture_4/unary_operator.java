package Units.Lecture_4;

public class unary_operator {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("         Unary_operator         ");

System.out.println("1.Unary Minus.....................................");
        System.out.println();
        int a = -5;
        System.out.println("Value of a is "+a);
        System.out.println("After  Unary Minus  ");
        a = -a;
        System.out.println("value of a is "+a);
System.out.println("________________________________________________");
       
System.out.println("2.Increment......................................");
        System.out.println();
        int x = 5;
        System.out.println("Value of c before Postfix Increment( c++ ) is "+x);
        int c = x++;
        System.out.println("Value of c after Postfix Increment  "+c);

        System.out.println("Value of b before Prefix Increment( ++b ) is "+x);

        int b = ++x; 
        System.out.println("Value of b after Prefix Increment  "+b);
System.out.println("________________________________________________");
       
System.out.println("3.Decrement......................................");
        System.out.println();
        int z = 5;
        System.out.println("Value of d before Postfix Decrement( d-- ) is "+z);
        int d = z--;
        System.out.println("Value of d after Postfix Decrement  "+d);

        System.out.println("Value of e before Prefix Decrement( --e ) is "+z);

        int e = --z; 
        System.out.println("Value of b after Prefix Dencrement  "+e);
System.out.println("________________________________________________");
       

System.out.println("4.Logical Complement (!)........................");
        System.out.println();
        
        boolean r = true;
        System.out.println("Value of r is "+r);
         r = !r;
        System.out.println("After Logical Complement ");
        System.out.println("Value of r is "+r); 


System.out.println("________________________________________________");

System.out.println("5.Bitwise Complement (~)........................");
        System.out.println();
        int m = 5;
        System.out.println("value of n is "+m); 
        System.out.println("After Bitwise Complement");    
        int n = ~m;
        System.out.println("Value of n is "+n);     

System.out.println("________________________________________________");

        
    }
}
