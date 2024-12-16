package StringName;

 public class StringBufferExample {
    public static void main(String[]args){
        String name= "Rutuja Rajendra Modke";
        StringBuffer sb = new StringBuffer(name);

        //append
        System.out.println(sb.append("From pune"));

        //insert
        System.out.println(sb.insert(5,"from India"));

        //replace
        System.out.println(sb.replace(3,6,"Nice Nature"));

        //delete
        System.out.println(sb.delete(8, 16));

        //reverse
        System.out.println(sb.reverse());

    }
}
