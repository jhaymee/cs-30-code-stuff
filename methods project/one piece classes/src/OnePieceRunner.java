// Program name: One Piece Classes

// Student name: Jhaymee Bisenio

// Date: 15 Apr 2024

// Program Description: two one piece characters, luffy and chopper, both have phrase and backstory methods. phrase makes them say an iconic phrase from them, and the backstory tells you their backstory.

public class OnePieceRunner {
    public static void main(String[] args) throws Exception {
        Luffy luffy = new Luffy();
        luffy.phrase();
        luffy.backstory();

        Chopper chopper = new Chopper();
        chopper.phrase();
        chopper.backstory();
    }
}
