// Program name: String Basics
// Student name: jhaymee Bisenio
// Date: 28 March 2024
// Program Description: manipulates strings

public class StringBasics {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy!";
        String target1 = "very ";

        String message2 = "That was great - lol.";
        String target2 = "lol";

        System.out.println(message1);
        System.out.println(message1.indexOf(target1));
        System.out.println(message1.length());
        System.out.print(message1.substring(0,5));
        System.out.println(message1.substring(10,16));

        // using a different method for message 2 because i didnt really get how i was supposed to do it for message1
        message2 = message2.replace(target2, "laugh out loud");
        System.out.println(message2);
    }
}
