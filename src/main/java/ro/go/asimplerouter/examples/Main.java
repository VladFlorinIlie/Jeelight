package ro.go.asimplerouter.examples;

import ro.go.asimplerouter.yeelight.Yeelight;

import java.io.IOException;


public class Main {

    public static void main(String args[]) throws IOException {
        Yeelight.discover();

        Yeelight yeelight = new Yeelight("192.168.1.160", 55443);
        yeelight.toggle();
    }
}
