// Static Nested Class Demo
class staticNestedClass { // Outer Class
    private int age = 40; // non-static member will be accessed through the object
    static int regnum = 99999; // static member will be accessed directly

    public static class AdharCard { // Static Nested Class
        void generate_id() { // non-static function can be declared in the static nested class
            System.out.println(regnum);
            System.out.println(new staticNestedClass().age); // accessing non-static member of outer class
        }

        static void call() {
            System.out.println("Static method call");
        }

        public static void main(String[] args) {
            AdharCard adhar = new AdharCard();
            adhar.generate_id();
            AdharCard.call();
            System.out.println("Adhar ID: " + adharid); // accessing constant from the static nested class
            System.out.println("Value of k: " + k); // accessing static variable from the static nested class
        }

        public static final int adharid = 90; // constant declaration
        static int k = 10; // static variable
    }

    public static void main(String[] args) {
        staticNestedClass.AdharCard adhar = new staticNestedClass.AdharCard();
        adhar.generate_id();
        staticNestedClass.AdharCard.call();
    }
}
