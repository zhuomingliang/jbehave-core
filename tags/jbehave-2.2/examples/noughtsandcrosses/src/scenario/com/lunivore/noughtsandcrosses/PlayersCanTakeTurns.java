package com.lunivore.noughtsandcrosses;

import com.lunivore.noughtsandcrosses.util.NoughtsAndCrossesScenario;

public class PlayersCanTakeTurns extends NoughtsAndCrossesScenario {

    public PlayersCanTakeTurns() {
        super(Thread.currentThread().getContextClassLoader());
    }
    
    public PlayersCanTakeTurns(ClassLoader classLoader) {
        super(classLoader);
    }

}
