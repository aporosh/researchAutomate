import org.example.ui.po.ChallengePage;
import org.junit.jupiter.api.Test;

public class ChallengeUITest extends BaseTest {

    private final static String CHALLENGE_URL = "http://158.160.42.61:3000/challenge/1";

    @Test
    public void openPage()  {
       // ChallengePage challengePage = new ChallengePage(CHALLENGE_URL);
        ChallengePage challengePage = new ChallengePage();
        challengePage.openWebSite(CHALLENGE_URL);
        int a = 0;
       // Thread.sleep(4000);
    }
}
