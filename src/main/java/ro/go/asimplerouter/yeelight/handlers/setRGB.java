package ro.go.asimplerouter.yeelight.handlers;

import ro.go.asimplerouter.yeelight.Connection;
import ro.go.asimplerouter.yeelight.utils.CommandBuilder;
import ro.go.asimplerouter.yeelight.utils.Effect;
import ro.go.asimplerouter.yeelight.utils.Method;
import ro.go.asimplerouter.yeelight.Yeelight;

public class setRGB {

    private static Connection connection = Yeelight.getConnection();

    public static String run(int rgb, Effect effect, int duration) {
        String data = CommandBuilder.build(Method.SET_RGB, rgb, Effect.toString(effect), duration);
        return connection.send(data);
    }

}
