class genericArray<T extends Number> {
    T[] arr;
    genericArray(T[] arr) {
        this.arr = arr;
    }
    void print(T[] arr) {
        double sum = 0;
        for (T item : arr) {
            sum = sum + item.doubleValue();
        }
        double average = sum / arr.length;
        System.out.println("Average: " + average);
    }
}
public class ave { 
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        new genericArray(intArray).print(intArray);
        Double[] doubleArray = {1.0,2.0,3.0,4.0,5.0};
        new genericArray(doubleArray).print(doubleArray);
    }
}
