package src.main.java.ro.go.asimplerouter.yeelight.Handlers;

import src.main.java.ro.go.asimplerouter.yeelight.Connection;
import src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils.CommandBuilder;
import src.main.java.ro.go.asimplerouter.yeelight.ExtraUtils.Method;
import src.main.java.ro.go.asimplerouter.yeelight.Yeelight;

public class toggle {

    private static Connection connection = Yeelight.getConnection();

    public static String run() {
        String data = CommandBuilder.build(Method.TOGGLE);
        return connection.send(data);
    }

}
