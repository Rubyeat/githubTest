package Generic;

public class Entry<KeyType, ValueType> {


    private final KeyType key;
    private final ValueType value;

    public Entry(KeyType key, ValueType value) {
        this.key = key;
        this.value = value;
    }

    public KeyType getKey() {
        return key;
    }

    public ValueType getValue() {
        return value;
    }

    public String toString() {
        return "(" + key + ", " + value + ")";
    }


    //This generic class could be used in the following ways, for example:
    public static void main(String[] args) {
        Entry<String, String> grade = new Entry<>("Mike", "A");
        Entry<String, Integer> mark = new Entry<String, Integer>("Mike", 100);
        System.out.println("grade: " + grade);
        System.out.println("mark: " + mark);

        //Entry obj= new Entry();


        Entry<Integer, Boolean> prime = new Entry<Integer, Boolean>(13, true);
        if (prime.getValue()) System.out.println(prime.getKey() + " is prime.");
        else System.out.println(prime.getKey() + " is not prime.");
    }
}

