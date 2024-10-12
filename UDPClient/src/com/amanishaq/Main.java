package com.amanishaq;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            // Getting host address: In this case local.
            // Otherwise it would be IP address.
            InetAddress address = InetAddress.getLocalHost();
            // Creating datagram socket: Not associated with port number.
            DatagramSocket datagramSocket = new DatagramSocket();

            // Getting user input.
            Scanner scanner = new Scanner(System.in);
            String echoString;

            do {
                System.out.println("Enter string to be echoed: ");
                echoString = scanner.nextLine();

                // Converting user input into a byte array.
                byte[] buffer = echoString.getBytes();

                // Packet contains data, address, and port number.
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5000);
                // Datagram packet being sent to server.
                datagramSocket.send(packet);

                byte[] buffer2 = new byte[50];
                packet = new DatagramPacket(buffer2, buffer.length);
                datagramSocket.receive(packet);
                System.out.println("Text received is: " + new String(buffer2, 0, packet.getLength()));

            } while(!echoString.equals("exit"));

        } catch(SocketTimeoutException e) {
            System.out.println("The socket timed out");
        } catch(IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
