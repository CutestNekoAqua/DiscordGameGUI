package me.waterdev.dgg.RPC;

import me.waterdev.dgg.DGG;

import java.io.IOException;
import java.util.Scanner;

public class RPCManager {

    public void handle() {

        try {
            if(DGG.rpc.set()) {
                endscreen();
            } else {
                System.out.println("Ooops. An error occured. If you want more help contact me over Discord c:");
                System.in.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void endscreen() {

        try {

            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else
            {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Everything started correctly!");
        System.out.println("If Discord doesn't register this as a Game check if Settings > Gameactivity > 'Display currently running game as a status message' is turned to on!");
        System.out.println("If you want to exit the programm press enter.");

        boolean x = true;


        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


        DGG.rpc.shutdown();
    }

}
