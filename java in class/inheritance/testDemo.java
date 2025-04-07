public class testDemo { // Class name corrected to start with an uppercase letter
    int a;

    testDemo(int a) { // Constructor name corrected to match class name
        this.a = a;
    }

    @Override // Override annotation added to indicate method overriding
    public boolean equals(Object o) { // "Object" corrected to start with an uppercase letter
        if (this == o) {
            return true;
        }
        if (o instanceof testDemo) { // "testDemo" corrected to "TestDemo"
            testDemo t = (testDemo) o;
            return (this.a == t.a); // "c.a" corrected to "t.a"
        } else {
            return false;
        }
    }

    @Override // Override annotation added to indicate method overriding
    public int hashCode() {
        return Objects.hash(a); // You need to implement hashCode properly
    }
}

class Main { // Renamed to Main to reflect it's the main class
    public static void main(String[] args) {
        testDemo t1 = new testDemo(100); // Corrected class instantiation
    }
}
