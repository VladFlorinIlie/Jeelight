package ro.go.asimplerouter.yeelight.utils;


public class CommandBuilder {

    private CommandBuilder() {}

    public static String build(Method method, Object... args) {
        StringBuilder params = new StringBuilder("[");
        for (int i = 0; i < args.length; i++) {
            boolean str = args[i] instanceof String;
            if (str) {
                params.append("\"");
            }

            params.append(args[i]);
            if (str) {
                params.append("\"");
            }

            if (i < args.length - 1) {
                params.append(", ");
            }
        }
        params.append("]");
        return "{\"id\":1, \"method\":\"" + Method.toString(method) + "\", \"params\":" + params + "}";
    }
}
