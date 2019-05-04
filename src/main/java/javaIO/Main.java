package javaIO;

import entity.ThongTinBang;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/tomain.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int count = 0;
        String line;
        ArrayList<ThongTinBang> list = new ArrayList<ThongTinBang>();
        while ((line = bufferedReader.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }

            String[] splitted = line.split("\\s{2,}");
            if (splitted.length == 4) {
                String day = splitted[0];
                String id = splitted[1];
                String title = splitted[2];
                int viewcount = Integer.parseInt(splitted[3]);
                ThongTinBang thongTinBang = new ThongTinBang(day, id, title, viewcount);
                list.add(thongTinBang);

            }
            count++;
        }

        HashMap<String, ThongTinBang> hashMap = new HashMap<String, ThongTinBang>();

        for (ThongTinBang information : list) {
            if (hashMap.containsKey(information.getId())) {

                information.setViewcount(hashMap.get(information.getId()).getViewcount() + information.getViewcount());

            }

            hashMap.put(information.getId(), information);
        }

        for (String id : hashMap.keySet()) {
            ThongTinBang thongTinBang = hashMap.get(id);
            System.out.println("Ngay: " + thongTinBang.getDay());
            System.out.println("Id video: " + thongTinBang.getId());
            System.out.println("Tieu de: " + thongTinBang.getTitle());
            System.out.println("Tong so view: " + thongTinBang.getViewcount());
            System.out.println("----------------------------");
        }
    }
}