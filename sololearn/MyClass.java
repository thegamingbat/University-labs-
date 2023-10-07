public class MyClass {
    static MyClass ref;
    String[] arguments;
    public void func(String[] args){
        ref.arguments = args;
    }

    public static void main(String[] args) {


        ref = new MyClass();
        ref.func(args);

    }


}
