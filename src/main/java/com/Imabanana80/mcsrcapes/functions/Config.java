package com.Imabanana80.mcsrcapes.functions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Config {
    public static void createDefaultConfig(){
        System.out.println("creating config.json");
        try{
            File config = new File("config.json");
            if (config.createNewFile()){
                System.out.println("created config.json");
                try {
                    System.out.println("writing config.json");
                    FileWriter configWriter = new FileWriter("config.json");
                    configWriter.write("{\n" +
                            "  \"path\": \"\",\n" +
                            "  \"minecraftcape\": \"\",\n" +
                            "  \"capefilename\": \"\"\n" +
                            "}\n");
                    configWriter.close();
                } catch (IOException e){
                    System.out.println("An error while writing default config files.");
                    e.printStackTrace();
                }

            } else {
                System.out.println("config.json already exists");
            }
        } catch (IOException e) {
            System.out.println("An error while creating default config files.");
            e.printStackTrace();
        }
    }
}
