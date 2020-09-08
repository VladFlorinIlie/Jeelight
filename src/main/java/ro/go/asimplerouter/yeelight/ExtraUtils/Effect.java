package src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils;

public enum Effect {

    SMOOTH,
    SUDDEN;

    public static String toString(Effect effect) {
        return effect.toString().toLowerCase();
    }

}
