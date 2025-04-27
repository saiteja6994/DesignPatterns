package TicTacToeGame.Strategies.BotPlayingStrategy;

import TicTacToeGame.Models.Board;
import TicTacToeGame.Models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
