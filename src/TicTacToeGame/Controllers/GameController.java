package TicTacToeGame.Controllers;

import TicTacToeGame.Models.Game;
import TicTacToeGame.Models.GameState;
import TicTacToeGame.Models.Player;
import TicTacToeGame.Strategies.WinningStrategy.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int size, List<Player> players, List<WinningStrategy> winningStrategies){
        return Game.getBuilder().setSize(size).setPlayers(players)
                .setWinningStrategies(winningStrategies).build();


    }
    public void makeMove(Game game){

    }

    public GameState checkGameState(Game game){
        return null;
    }
    public Player getWinner(Game game){
        return game.getWinner();
    }
}
