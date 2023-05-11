package basic_prgm;

public class fibonaci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        while(c > -1 )
        {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            if (c > 100)
            {
                break;
            }
        }
    }
}
