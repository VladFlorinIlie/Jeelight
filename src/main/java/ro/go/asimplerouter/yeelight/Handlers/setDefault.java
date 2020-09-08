package src.main.java.ro.go.asimplerouter.yeelight.Handlers;

import src.main.java.ro.go.asimplerouter.yeelight.Connection;
import src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils.CommandBuilder;
import src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils.Method;
import src.main.java.ro.go.asimplerouter.yeelight.Yeelight;

public class setDefault {

    private static Connection connection = Yeelight.getConnection();

    public static String run() {
        String data = CommandBuilder.build(Method.SET_DEFAULT);
        return connection.send(data);
    }

}
