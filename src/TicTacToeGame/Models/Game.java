package TicTacToeGame.Models;

import TicTacToeGame.Strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextMovePlayerIndex;
    private List<WinningStrategy> winningStrategies;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Game(int size,List<Player> players,List<WinningStrategy> winningStrategies){
        this.board=new Board(size);
        this.players=players;
        this.nextMovePlayerIndex=0;
        this.gameState=GameState.IN_PROGRESS;
        this.moves=new ArrayList<>();
        this.winningStrategies=winningStrategies;
    }
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public static class Builder{
        private int size;
        private List<Player> players;
//        private List<Move> moves;
//        private Player winner;
//        private GameState gameState;
//        private int nextMovePlayerIndex;
        private List<WinningStrategy> winningStrategies;
        private Builder(){
            this.players=new ArrayList<>();
            this.size=0;
            this.winningStrategies=new ArrayList<>();
        }
        private void validateBotCnt(){
            int cnt=0;
            for(Player player:players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    cnt++;
                    if(cnt>1){
                        throw new RuntimeException("Only one bot is allowed in the game");
                    }
                }
            }
        }
        private void validateUniqueSymbol(){
            Set<Character> symbolSet=new HashSet<>();
            for(Player player:players){
                symbolSet.add(player.getSymbol().getaChar());
            }

            if(symbolSet.size()!=size-1){
                throw new RuntimeException("Every player should have unque Symbol");
            }
        }
        private void validations(){
            validateBotCnt();
            validateUniqueSymbol();
        }
        public Game build(){
            //validation starts
            validations();
            return new Game(size,players,winningStrategies);
        }
        public int getSize() {
            return size;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public List<WinningStrategy> getWinningStrategies() {
            return winningStrategies;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
    }
}
