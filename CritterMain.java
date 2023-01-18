// John Bedlington and Michael Woo
// CS 145
// Lab 2: Critters
//IntelliJ IDEA

// This program creates different types of Critters, each with their own traits that may benefit or harm them.
// In this survival of the fittest simulator all the critters are pitted against each other in an enclosed area
// to see who is the strongest of them all.

public class CritterMain {
    public static void main(String[] args) {
        CritterFrame frame = new CritterFrame(60, 40);

        // uncomment each of these lines as you complete these classes
        frame.add(30, Bear.class);
        frame.add(30, Lion.class);
        frame.add(30, Giant.class);
        frame.add(30, Orca.class);

        frame.add(30, FlyTrap.class);
        frame.add(30, Food.class);

        frame.start();
    }
}
