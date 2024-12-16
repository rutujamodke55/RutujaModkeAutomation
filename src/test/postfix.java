package test;

public class postfix {
    public static void main(String[] args) {
        int x=10;
        int y=x++;
        int z=y;
               //postfix increment
       System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //postfix decrement
        int a=12;
        int b=a--;
        int c=b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
