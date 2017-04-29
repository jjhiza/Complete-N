package elysium.com.n_intro;

/**
 * Created by jay on 4/28/17.
 */

public class Player {

    private String handleName;
    private int playerLives;
    private int playerLevel;
    private int playerScore;

    public Player() {

        handleName = "Unknown player";
        playerLives = 3;
        playerLevel = 1;
        playerScore = 0;
    }

    public String getHandleName() {

        return handleName;
    }

    public void setHandleName(String handle) {

        if (handle.length() < 3) {
            return;
        }
        handleName = handle;
    }
}


