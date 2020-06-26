package me.waterdev.dgg;

import me.waterdev.dgg.Navi.MainMenu;
import me.waterdev.dgg.RPC.Manager;


import java.io.StringWriter;

public class DGG {

    public static Manager rpc = new Manager();

    public static JoinSpecStrings stringshandler = new JoinSpecStrings();


    public static void main(String args[]) {

        System.out.println("#################################");
        System.out.println("# Initialising Discord Bridge.. #");

        rpc.init();

        System.out.println("# Done! Discord Loaded.         #");
        System.out.println("#################################");

        System.out.println("\n");

        System.out.println("Press enter to continue...");

        StringWriter writer = new StringWriter();


        try{

            System.in.read();

            new MainMenu().main();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
