public class Operators {
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2 = 5;
        System.out.println("sum of num1 and num2 : "+(num1+num2));
        System.out.println("diff of num1 and num2 : "+(num1-num2));
        System.out.println("product of num1 and num2 : "+(num1*num2));
        System.out.println("div of num1 and num2 : "+(num1/num2));
        System.out.println("mod of num1 and num2 : "+(num1%num2));
     


// increment and decrement funtions
 int count = 4;
 count++;
 System.out.println(count);
 int count1 = 7;
 count1--;
 System.out.println(count1);

// Compound Assignment operators
int x = 7;
x=x+2;
System.out.println(x);

int y=3;
y+=4;
System.out.println(y);

int a=3;
a-=4;
System.out.println(a);

// Relational / Comparison Operators
int n=6;
int n1=5;
System.out.println(n == n1);
System.out.println(n != n1);
System.out.println(n > n1);

// logical operators
int n2=9;
int n3=8;
int n4=7;
int n5=6;
System.out.println(n2 > n3 && n3 > n4  );
System.out.println(n2 > n3 && n3 < n4  );

System.out.println(n2 > n3 || n3 > n4  );
System.out.println(n2 > n3 || n3 < n4  );

System.out.println(!(n2>n3));
boolean result = n2>n3;
System.out.println(result);
System.out.println(!result);

//bitwise operators
int g=5;
int f=9;
System.out.println(g & f);
System.out.println(g | f);

    }
}