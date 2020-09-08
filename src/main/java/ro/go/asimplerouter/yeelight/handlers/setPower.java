package ro.go.asimplerouter.yeelight.handlers;

import ro.go.asimplerouter.yeelight.Connection;
import ro.go.asimplerouter.yeelight.utils.CommandBuilder;
import ro.go.asimplerouter.yeelight.utils.Effect;
import ro.go.asimplerouter.yeelight.utils.Method;
import ro.go.asimplerouter.yeelight.Yeelight;

public class setPower {

    private static Connection connection = Yeelight.getConnection();

    public static String run(boolean state, Effect effect, int duration) {
        String data = CommandBuilder.build(Method.SET_POWER, convertBoolean(state), Effect.toString(effect), duration);
        return connection.send(data);
    }

    private static String convertBoolean(boolean bool) {
        return bool ? "on" : "off";
    }

}
