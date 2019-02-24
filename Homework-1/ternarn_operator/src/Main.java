import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int teamOne;
        int teamTwo;
        int betTeamOne;
        int betTeamTwo;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        teamOne = Integer.parseInt(reader.readLine());
        teamTwo = Integer.parseInt(reader.readLine());
        betTeamOne = Integer.parseInt(reader.readLine());
        betTeamTwo = Integer.parseInt(reader.readLine());
        System.out.println(Football.wonOrLost(teamOne, teamTwo, betTeamOne, betTeamTwo));
    }

}
