import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        

        while(true)
        {
            String computer = computerGuess();
            String user = readLine("rock, paper, or scissors? ");
            String winner = getWinner(user, computer);

            if((winner.equals("User wins!")))
            {
                System.out.println(winner);
                break;
            }
            else if((winner.equals("Tie")))
            {
                System.out.println(winner);
            }
            else
            {
                System.out.println(winner);
            }
        }
        
    }

    public static String getWinner(String user, String computer) {

        String TIE = "Tie";
        String USER_PLAYER = "User wins!";
        String COMPUTER_PLAYER = "Computer wins!";

        if(user.equals(computer))
        {
            return TIE;
        }
        else if(user.equals("rock") && computer.equals("paper"))
        {
            return COMPUTER_PLAYER;
        }
        else if(user.equals("paper") && computer.equals("rock"))
        {
            return USER_PLAYER;
        }
        else if(user.equals("paper") && computer.equals("scissors"))
        {
            return COMPUTER_PLAYER;
        }
        else if(user.equals("scissors") && computer.equals("paper"))
        {
            return USER_PLAYER;
        }
        else if(user.equals("scissors") && computer.equals("rock"))
        {
            return COMPUTER_PLAYER;
        }
        else if(user.equals("rock") && computer.equals("scissors"))
        {
            return USER_PLAYER;
        }
        else if(user.equals("scissors") && computer.equals("paper"))
        {
            return COMPUTER_PLAYER;
        }
    
        return TIE;
    }

    public static String computerGuess() {
        int num = Randomizer.nextInt(1, 3);
        if (num == 1) {
            return "rock";
        } else if (num == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String readLine(String scanner) {
        Scanner x = new Scanner(System.in);

        System.out.print(scanner);
        String name = x.nextLine();

        return name;
    }
}
