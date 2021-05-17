package com.example.demo.oop;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class FileInputOutputWithThread {
    public static void main(String[] args) throws IOException, InterruptedException {

        final PipedInputStream inputStream = new PipedInputStream();
        final PipedOutputStream outputStream = new PipedOutputStream();

        //Connect the reader and writer
        inputStream.connect(outputStream);

        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 65; i < 91; i++) {
                    try {
                        outputStream.write(i);
                        Thread.sleep(500);
                    } catch (IOException | InterruptedException ex) {
                        ex.getMessage();
                    }

                }
            }
        });

        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 65; i < 91; i++) {
                    try {
                        System.out.print((char)inputStream.read());
                        Thread.sleep(500);
                    } catch (IOException | InterruptedException ex) {
                        ex.getMessage();
                    }
                }
            }
        });

        writer.start();
        reader.start();

        //join and wait
        writer.join();
        reader.join();

        //close
        inputStream.close();
        outputStream.close();

    }

}
