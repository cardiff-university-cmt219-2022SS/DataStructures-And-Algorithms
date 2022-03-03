package cn.allwayz.Learning.lastYearSource.Exam2013.Q3;

import java.io.*;

/**
 * @author allwayz
 * @create 2022-03-02 22:17
 */
public class b {
    public static void main(String[] args) throws IOException {
        CountPrint("avsd");
    }

    public static void CountPrint(String charList) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/allwayz/Documents/git/DataStructures-And-Algorithms/src/cn/allwayz/Learning/lastYearSource/Exam2013/Q3/document.txt"));
        StringBuffer buffer = new StringBuffer();
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            buffer.append(str);
        }
        String file = buffer.toString();
        for (int i = 0; i < charList.length(); i++) {
            String s = String.valueOf(charList.charAt(i));
            int count = 0;
            for (int j = 0; j < file.length(); j++) {
                if (s.equals(String.valueOf(file.charAt(j)))) {
                    count++;
                }
            }
            System.out.println(s + ": " + count);
        }
    }
}
