package ro.go.asimplerouter.yeelight.handlers;

import ro.go.asimplerouter.yeelight.Connection;
import ro.go.asimplerouter.yeelight.utils.CommandBuilder;
import ro.go.asimplerouter.yeelight.utils.Method;
import ro.go.asimplerouter.yeelight.Yeelight;

public class setDefault {

    private static Connection connection = Yeelight.getConnection();

    public static String run() {
        String data = CommandBuilder.build(Method.SET_DEFAULT);
        return connection.send(data);
    }

}
