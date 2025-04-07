// commandling argument

public class commandline {

    public static void main(String[] args) {
        int age = Integer.parseInt(args[2]);
        String vote = (age>=18) ? "Eligible to vote" : "not eligible to vote";
        System.out.println(vote);
    }
}
