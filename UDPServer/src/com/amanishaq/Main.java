package com.amanishaq;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Main {

    public static void main(String[] args) {

        try {
            DatagramSocket socket = new DatagramSocket(5000);

            while(true) {
                // Byte array accepts data from the socket.
                byte[] buffer = new byte[50];
                // Packet populated with whatever is received from the socket.
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                // Receive method used to fill packet with the content.
                // This method actually blocks until data is received.
                socket.receive(packet);
                System.out.println("Text received is: " + new String(buffer, 0, packet.getLength()));

                String returnString = "echo: " + new String(buffer, 0, packet.getLength());
                byte[] buffer2 = returnString.getBytes();
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buffer2, buffer2.length, address, port);
                socket.send(packet);
            }

        } catch(SocketException e) {
            System.out.println("SocketException: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
