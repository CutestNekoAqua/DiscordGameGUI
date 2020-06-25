package me.waterdev.dgg.Navi;

import me.waterdev.dgg.DGG;
import me.waterdev.dgg.RPC.RPCManager;

import java.util.Scanner;

public class MainMenu {

    public Scanner in = new Scanner(System.in);

    public boolean inmenu = true;

    public void main() {

        //Trying to clear the screen xD

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

        System.out.println("-------------------------------------------------");
        System.out.println("| Custom Discord RPC                            |");
        System.out.println("-------------------------------------------------");
        System.out.println("| 1 | Start demo Config                         |");
        System.out.println("| 2 | Load custom Config                        | (W I P)");
        System.out.println("| 3 | Create custom Config                      | (W I P)");
        System.out.println("-------------------------------------------------");
        System.out.println("| Created by Waterdev <3                        |");
        System.out.println("| Discord: 【Waterdev | 水現像液 | Valentin】#0666|");
        System.out.println("-------------------------------------------------\n");

        while (inmenu) {

            int num = in.nextInt();

            if(num == 1) {
                inmenu = false;
                new RPCManager().handle();
            }

        }

    }

}
