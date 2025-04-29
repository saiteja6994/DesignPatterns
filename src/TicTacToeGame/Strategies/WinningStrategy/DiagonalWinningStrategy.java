package TicTacToeGame.Strategies.WinningStrategy;

import TicTacToeGame.Models.Board;
import TicTacToeGame.Models.Move;

public class DiagonalWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
