package elysium.com.n_intro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static void main(String[] args) {
        System.out.println("Hello world... again");
        System.out.println("My millionth Java program");

        String jay;
        jay = "Jay Hiza";
        System.out.println(jay);

        int weeklySalary = 50;
        int monthlySalary = weeklySalary * 4;
        System.out.println("Weekly salary: " + "$"+weeklySalary);
        System.out.println("Monthly Salary: " + "$"+monthlySalary);

        int apples = 6;
        int oranges = 5;
        int fruit = apples + oranges;
        System.out.println("I have " + fruit + " pieces of fruit");

        int weeks = 130;
        double years = weeks / 52.0;
        System.out.println(weeks + " weeks " + "equals " + years + " years");

        System.out.println("Hello " + jay + " here");

        int lives = 2;
        boolean isGameOver = (lives < 1);
        System.out.println(isGameOver);

        if (isGameOver) {
            System.out.println("You Died");
        } else {
            System.out.println("Abyss Walker");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
