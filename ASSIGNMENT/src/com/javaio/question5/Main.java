package com.javaio.question5;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileInputStream("E:\\praticejava\\ASSIGNMENT\\src\\com\\javaio\\question5\\Test_In.csv"));
        FileWriter writer = new FileWriter("E:\\praticejava\\ASSIGNMENT\\src\\com\\javaio\\question5\\Test_Out.txt");
        HashMap<String, Integer> ref = new HashMap<>();
        if (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] columns = line.split(",");
            for (int i = 0; i < columns.length; i++)
                ref.put(columns[i], i);
            writer.append("First Name").append("\n");
            writer.append("Last Name").append("\n");
            writer.append("Serial Name").append("\n");
            writer.append("Alias Name").append("\n");
            writer.append("Quote Name").append("\n");
        }
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] columns = line.split(",");
            writer.append(columns[ref.get("First Name")]).append("\n");
            writer.append(columns[ref.get("Last Name")]).append("\n");
            writer.append(columns[ref.get("Serial")]).append("\n");
            writer.append(columns[ref.get("Alias")]).append("\n");
            writer.append(columns[ref.get("Quote")]).append("\n");
        }
        writer.close();
    }
}
