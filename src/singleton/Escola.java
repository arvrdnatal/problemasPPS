package singleton;

// primeira forma
/*public class Escola {
    public static final Escola INSTANCE = new Escola();

    private Escola() {
    }
}*/

// segunda forma
/*public class Escola {
    private static final Escola INSTANCE = new Escola();

    private Escola() {
    }

    public static Escola getInstance() {
        return INSTANCE;
    }
}*/

// terceira forma e mais usada
public class Escola {
    private static Escola INSTANCE = null;

    private Escola() {
    }

    public static Escola getInstance() {
        if(INSTANCE == null) INSTANCE = new Escola();
        return INSTANCE;
    }
}