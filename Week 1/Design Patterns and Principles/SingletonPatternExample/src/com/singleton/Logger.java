package com.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;
    private Logger() {
        try {
            FileWriter fileWriter = new FileWriter("log.txt", true);
            writer = new PrintWriter(fileWriter, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        writer.println("Log: " + message);
        System.out.println("Log: " + message);
    }
    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}
