import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Football {


    public static int wonOrLost(int resultTeamOne, int resultTeamTwo, int betResultTeamOne, int betResultTeamTwo) {
        int result;
        result = ((resultTeamOne == betResultTeamOne) && (resultTeamTwo == betResultTeamTwo)) ? 2 :
                (((resultTeamOne - resultTeamTwo >= 0) && (betResultTeamOne - betResultTeamTwo) >= 0) ||
                        (resultTeamOne - resultTeamTwo < 0) && (betResultTeamOne - betResultTeamTwo) < 0) ? 1 : 0;

        return result;
    }
}
