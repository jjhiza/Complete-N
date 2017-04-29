package elysium.com.n_intro;

/**
 * Created by jay on 4/28/17.
 */

public class Demo {

    public static void main(String[] args) {

        Player jay = new Player();
        System.out.println(jay.getHandleName());
        jay.setHandleName("Jay");
        System.out.println(jay.getHandleName());
    }
}
