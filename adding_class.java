public class adding_class {

    void add( int a , int b){
        System.out.println(a+b);
    }

    int getValue(int a , int b ){
        return a+b;
    }

    String getName(String name){
        return name;
    }

    public static void main(String[] args) {
        adding_class obj1 = new adding_class();

        // int return_value = obj1.getValue(10, 20);

        // System.out.println(return_value);

        String name1 =obj1.getName("Nimal");

        System.out.println(name1);
    }
}