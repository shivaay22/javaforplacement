public class StringBuilders {
    
    public static void main(String[] args) {
        String str = "this is Geeksforgeeks";
        StringBuilder sb = new StringBuilder(str);
        // System.out.println(sb.length());
        // System.out.println(sb.charAt(3));
        // System.out.println(sb.indexOf("g"));
        // sb.append("now");
        // sb.insert(0, "java");
        // System.out.println(sb);
        // sb.deleteCharAt(5);
        // sb.delete(0, 5);
        // sb.insert(0, "That is ");
        // System.out.println(sb);
        sb.replace(0, 6, "what is");
        System.out.println(sb);


    }
}
