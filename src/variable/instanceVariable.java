package variable;

import javax.management.MBeanAttributeInfo;

public class instanceVariable{
    //instance variable: inside class but outside of method
    int a =10;
    public static void main(String[] args) {
        instanceVariable var = new instanceVariable();
        System.out.println(var.a);
    }
}
