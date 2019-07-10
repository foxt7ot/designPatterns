package org.design.patterns.creational.singleton;

import java.io.Serializable;

class SerializableSingletonCaptain implements Serializable {

    private static final long serialVersionUID = 243234234234234L;

    private SerializableSingletonCaptain() {
    }

    private static final class SingletonHelper {
        private static SerializableSingletonCaptain captain = new SerializableSingletonCaptain();
    }

    public static SerializableSingletonCaptain getCaptain() {
        return SingletonHelper.captain;
    }

    protected Object readResolve() {
        return getCaptain();
    }
}

public class Problems {

    /**
     * We can break Singleton pattern by Reflection/Serialization. For Reflection Joshua Bloch suggested to use Enum, and for
     * Serialization we can override readResolve method
     */
}
