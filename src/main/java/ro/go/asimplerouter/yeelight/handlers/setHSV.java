package ro.go.asimplerouter.yeelight.handlers;

import ro.go.asimplerouter.yeelight.Connection;
import ro.go.asimplerouter.yeelight.utils.CommandBuilder;
import ro.go.asimplerouter.yeelight.utils.Effect;
import ro.go.asimplerouter.yeelight.utils.Method;
import ro.go.asimplerouter.yeelight.Yeelight;

public class setHSV {

    public static Connection connection = Yeelight.getConnection();

    public static String run(int hue, int sat, Effect effect, int duration) {
        String data = CommandBuilder.build(Method.SET_HSV, hue, sat, Effect.toString(effect), duration);
        return connection.send(data);
    }
}
