package Functions;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun(2,3);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        System.out.println(a+b);

    }
}
