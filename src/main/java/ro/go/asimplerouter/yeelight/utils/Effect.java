package ro.go.asimplerouter.yeelight.utils;

public enum Effect {

    SMOOTH,
    SUDDEN;

    public static String toString(Effect effect) {
        return effect.toString().toLowerCase();
    }

}
