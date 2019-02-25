import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ternary{

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

            reader.close();
            System.out.println(wonOrLost(teamOne, teamTwo, betTeamOne, betTeamTwo));
        }


        public static int wonOrLost(int teamOne, int teamTwo, int betTeamOne, int betTeamTwo) {
            int whoIsWinner = (teamOne > teamTwo) ? 1 : 0;
            int betWinner = (betTeamOne > betTeamTwo) ? 1 : 0;
            int guessedResult = (whoIsWinner == betWinner) ? 1 : 0;

            return ((teamOne == betTeamOne) && (teamTwo == betTeamTwo)) ? 2 : guessedResult;
        }
    }