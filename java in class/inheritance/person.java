public class person {
    public static class human
    {
        protected void print()
        {
            System.out.println("I am person");
        }
    }
    static class teacher extends human
    {
        public void print()
        {
            System.out.println("I am the Teacher");
        }
    }
    static class doctor extends human {
    
        public void print()
        {
            System.out.println("I am the Doctor");
        }
    }
    public static void main(String[] args) {
        human h1 = new teacher();
        h1.print();
        human h2 = new doctor();
        h2.print();
    }
}
