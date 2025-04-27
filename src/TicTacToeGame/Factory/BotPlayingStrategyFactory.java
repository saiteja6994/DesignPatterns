package TicTacToeGame.Factory;

import TicTacToeGame.Models.BotDifficultyLevel;
import TicTacToeGame.Strategies.BotPlayingStrategy.BotPlayingStrategy;
import TicTacToeGame.Strategies.BotPlayingStrategy.EasyBotPlayingStrategy;
import TicTacToeGame.Strategies.BotPlayingStrategy.HardBotPlayingStrategy;
import TicTacToeGame.Strategies.BotPlayingStrategy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyFactory(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        }
        else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)){
            return new MediumBotPlayingStrategy();
        }
        else {
            return new HardBotPlayingStrategy();
        }
    }
}
