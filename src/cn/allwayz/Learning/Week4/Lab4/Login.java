package cn.allwayz.Learning.Week4.Lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author allwayz
 * @create 2022-02-18 17:24
 */
public class Login {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(
                "/Users/allwayz/Documents/git/DataStructures-And-Algorithms/src/cn/allwayz/Learning/Week4/Lab4/users.txt"
        ));

        String str;
        ArrayList<User> userArrayList = new ArrayList<>();
        while ((str = in.readLine()) != null) {
            String[] strings = str.split(" ");
            User user = new User(strings[0].trim(), strings[1].trim());
            userArrayList.add(user);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User name and User Password");
        User user = new User(scanner.nextLine().trim(), scanner.nextLine().trim());
        boolean flag = false;
        for (User temp : userArrayList) {
            if (user.equals(temp)) {
                flag = true;
            }
        }
        System.out.println(flag ? "Login Success" : "Invalid");
    }
}

class User {
    private String username;
    private String password;

    public User(String name, String passwd) {
        this.username = name;
        this.password = passwd;
    }

    public boolean equals(User user) {
        return username.equals(user.username) && password.equals(user.password);
    }
}
