package org.design.patterns.singleton;

/**
 * Why class is final? See {@link FootBallCaptain}
 */
public final class Captain {

    private static Captain captain;

    // Eager Initialization: private static Captain captain = new Captain();
    private Captain() {
    }

    /**
     * Why Synchronized here: Consider the following case. Suppose, in a multithreaded environment, two (or more) threads try
     * to evaluate this:
     * if (captain == null)
     * And if they see that the instance is not created yet, each of them will try to create a new instance. As a result,
     * we may end up with multiple instances of the class
     */

    public synchronized static Captain getCaptain() {
        /**
         Here Lazy Initialization is happening: Lazy initialization is a technique through which you delay the object
         creation process. It says that you should create an object only when it is required. This approach can be
         helpful when you deal with expensive processes to create an object
         Singleton instance won't get created until getCaptain is called
         */
        if (null == captain) {
            captain = new Captain();
        }
        return captain;
    }

}