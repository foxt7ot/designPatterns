package org.design.patterns.singleton;

public class FootBallCaptain {
    private static FootBallCaptain footBallCaptain;
    //We make the constructor private to prevent the use of "new"
    private static int numberOfInstance = 0;

    private FootBallCaptain() {
        numberOfInstance++;
        System.out.println("Number of instances at this moment=" + numberOfInstance);
    }

    public static synchronized FootBallCaptain getFootBallCaptain() {
        if (footBallCaptain == null) {
            footBallCaptain = new FootBallCaptain();
        }
        return footBallCaptain;
    }

    //A non-static nested class (inner class)
    public class CaptainDerived extends FootBallCaptain {
        //Some code
    }

    public static void main(String[] args) {
        FootBallCaptain captain1 = FootBallCaptain.getFootBallCaptain();
        System.out.println("Trying to make another captain for your team:");
        FootBallCaptain captain2 = FootBallCaptain.getFootBallCaptain();
        if (captain1 == captain2)
        {
            System.out.println("captain1 and captain2 are same instance.");
        }
        FootBallCaptain.CaptainDerived derived=captain1.new CaptainDerived();
    }
}
