public class Main {
    public static void main(String[] args) {
        
        StudentDAO dao = new StudentDAO();
        dao.showAllStudents();
        
        System.out.println("\nCalling again to prove Singleton works:");
        dao.showAllStudents();
    }
}
