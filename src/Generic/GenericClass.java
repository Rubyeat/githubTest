package Generic;

public class GenericClass  < T1, T2 >{
    public void display (T1 var1, T2 var2){
        System.out.println("Name: " + var1 + " ID: " + var2);
    }

    public static void main(String[] args) {
        GenericClass<String, Integer> obj = new GenericClass<String, Integer>();
        obj.display("Monica", 1234);
        GenericClass<Integer, Integer> obj1 = new GenericClass<Integer, Integer>();
        obj1.display(123, 1234);
        GenericClass<Character, Double> obj2 = new GenericClass<Character, Double>();
        obj2.display('A', 1234.0);
    }
}
