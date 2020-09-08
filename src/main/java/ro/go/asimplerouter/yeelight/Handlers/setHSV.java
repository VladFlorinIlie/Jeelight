package src.main.java.ro.go.asimplerouter.yeelight.Handlers;

import src.main.java.ro.go.asimplerouter.yeelight.Connection;
import src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils.CommandBuilder;
import src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils.Effect;
import src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils.Method;
import src.main.java.ro.go.asimplerouter.yeelight.Yeelight;

public class setHSV {

    public static Connection connection = Yeelight.getConnection();

    public static String run(int hue, int sat, Effect effect, int duration) {
        String data = CommandBuilder.build(Method.SET_HSV, hue, sat, Effect.toString(effect), duration);
        return connection.send(data);
    }
}
