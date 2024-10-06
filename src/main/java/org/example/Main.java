package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            // Start the RabbitMQ Receiver
            Recv.main(new String[]{});

            // Start the RabbitMQ Sender
            Send.main(new String[]{});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
