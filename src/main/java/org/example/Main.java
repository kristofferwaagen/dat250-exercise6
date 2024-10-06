package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Experiment to run: (2) Work Queues, (4) Publish/Subscribe");
        int choice = scanner.nextInt();

        try {
            if (choice == 2) {
                // Start Experiment 2/3: Work Queues
                Recv.main(new String[]{});
                Send.main(new String[]{});
            } else if (choice == 4) {
                // Start Experiment 4: Publish/Subscribe
                EmitLog.main(new String[]{});
                ReceiveLogs.main(new String[]{});
            } else {
                System.out.println("Invalid choice. Please choose 2 or 4.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}