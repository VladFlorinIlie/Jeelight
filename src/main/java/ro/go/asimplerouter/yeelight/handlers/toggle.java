package ro.go.asimplerouter.yeelight.handlers;

import ro.go.asimplerouter.yeelight.Connection;
import ro.go.asimplerouter.yeelight.utils.CommandBuilder;
import ro.go.asimplerouter.yeelight.utils.Method;
import ro.go.asimplerouter.yeelight.Yeelight;

public class toggle {

    private static Connection connection = Yeelight.getConnection();

    public static String run() {
        String data = CommandBuilder.build(Method.TOGGLE);
        return connection.send(data);
    }

}
