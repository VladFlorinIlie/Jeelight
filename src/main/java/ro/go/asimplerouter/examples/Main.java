package src.main.java.ro.go.asimplerouter.examples;

import src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils.Effect;
import src.main.java.ro.go.asimplerouter.yeelight.Yeelight;


public class Main {

    private static Yeelight yeelight = new Yeelight("192.168.1.160", 55443);

    public static void main(String args[]) {
        yeelight.setPower(true, Effect.SMOOTH, 1000);

    }
}
