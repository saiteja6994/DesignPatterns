package TicTacToeGame;

import TicTacToeGame.Controllers.GameController;
import TicTacToeGame.Models.Game;
import TicTacToeGame.Models.Player;
import TicTacToeGame.Models.PlayerType;
import TicTacToeGame.Models.Symbol;
import TicTacToeGame.Strategies.WinningStrategy.ColWinningStrategy;
import TicTacToeGame.Strategies.WinningStrategy.DiagonalWinningStrategy;
import TicTacToeGame.Strategies.WinningStrategy.RowWinningStrategy;
import TicTacToeGame.Strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Game starts");
        Scanner scanner=new Scanner(System.in);
//        int size=scanner.nextInt();
        int size=3;
        List<Player> players=new ArrayList<>();
        players.add(new Player(new Symbol('X'),"Anand", PlayerType.HUMAN));
        players.add(new Player(new Symbol('O'),"scalar",PlayerType.BOT));
        List<WinningStrategy> winningStrategies=List.of(
                new RowWinningStrategy(),
                new ColWinningStrategy(),
                new DiagonalWinningStrategy()
        );
        GameController gameController=new GameController();
        Game game= gameController.startGame(size,players,winningStrategies);

        System.out.println("DEBUG");

    }
}
