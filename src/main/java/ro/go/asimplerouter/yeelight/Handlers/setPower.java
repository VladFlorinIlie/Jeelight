package src.main.java.ro.go.asimplerouter.yeelight.Handlers;

import src.main.java.ro.go.asimplerouter.yeelight.Connection;
import src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils.CommandBuilder;
import src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils.Effect;
import src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils.Method;
import src.main.java.ro.go.asimplerouter.yeelight.Yeelight;

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
