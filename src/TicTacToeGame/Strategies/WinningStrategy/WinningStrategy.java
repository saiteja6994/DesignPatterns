package TicTacToeGame.Strategies.WinningStrategy;

import TicTacToeGame.Models.Board;
import TicTacToeGame.Models.Cell;
import TicTacToeGame.Models.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Player player, Cell cell);
}
