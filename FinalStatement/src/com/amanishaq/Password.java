package com.amanishaq;

public class Password {

    private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key; // The ^ is known as the X-OR.
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Access Granted");
            return true;
        } else {
            System.out.println("Access Denied");
            return false;
        }
    }
}
