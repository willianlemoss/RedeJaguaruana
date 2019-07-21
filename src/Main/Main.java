package Main;

import View.LogInScreen;

public class Main {
    public static void main(String[] args) {
        LogInScreen vl = new LogInScreen();
        vl.setTitle("Login");
        vl.setResizable(false);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true);
    }
}
