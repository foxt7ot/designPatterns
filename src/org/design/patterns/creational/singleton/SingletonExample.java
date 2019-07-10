package org.design.patterns.creational.singleton;

/**
 * GoF Definition
 * Ensure a class only has one instance, and provide a global point of access to it.
 */

/**
 * Key characteristics:
 * The constructor is private to prevent the use of a “new” operator.
 * You’ll create an instance of the class, if you did not create any such instance earlier; otherwise, you’ll simply reuse the existing one.
 * To take care of thread safety, I use the “synchronized” keyword.
 */

/**
 * Real World Analogy
 * Let’s assume that you are a member of a sports team, and your team is participating in a tournament. Your team needs
 * to play against multiple opponents throughout the tournament. Before each of these matches, as per the rules of the
 * game, the captains of the two sides must do a coin toss. If your team does not have a captain, you need to elect
 * someone as a captain. Prior to each game and each coin toss, you may not repeat the process of electing a captain
 * if you already nominated a person as a captain for the team. Basically, from every team member’s perspective,
 * there should be only one captain of the team.
 *
 * Another example would be of Government before initiation of new phase a government is elected by people which
 * continues to run until next election
 */
//Bill Pugh’s Solution
class CricketCaptain {

    private CricketCaptain() {
    }

    private static class SingletonHelper {
        private static final CricketCaptain cricketCaptain = new CricketCaptain();
    }

    public static CricketCaptain getCaptain() {
        return SingletonHelper.cricketCaptain;
    }
}

// DoubleCheckLocking
class HockeyCaptain {

    private static HockeyCaptain hockeyCaptain;

    private HockeyCaptain() {
    }

    public static HockeyCaptain getHockeyCaptain() {
        if (hockeyCaptain == null) {
            synchronized (HockeyCaptain.class) {
                if (null == hockeyCaptain) {
                    hockeyCaptain = hockeyCaptain;
                }
            }
        }
        return hockeyCaptain;
    }
}

public class SingletonExample {

    public static void main(String[] args) {
        CricketCaptain captain = CricketCaptain.getCaptain();
        CricketCaptain captain2 = CricketCaptain.getCaptain();
        System.out.println(captain == captain2);
    }
}
