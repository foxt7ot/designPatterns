package org.design.patterns.singleton;

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
