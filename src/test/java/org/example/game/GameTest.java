package org.example.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GameTest {

    Game game = new Game();

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.Roll(pins);
        }
    }

    private void rollSpare() {
        game.Roll(5);
        game.Roll(5);
    }

    private void rollStrike() {
        game.Roll(10);
    }

    @Test
    public void Game_with_pins_equal_0() {
        rollMany(20, 0);
        assertEquals(0, game.Score());
    }

    @Test
    public void All_Ones() {
        rollMany(20, 1);
        assertEquals(20, game.Score());
    }

    @Test
    public void Spare_down_10_on_2_tries_with_extra_ball() {
        rollSpare();
        game.Roll(3);
        rollMany(17, 0);
        assertEquals(16, game.Score());
    }

    @Test
    public void Strike_down_10_with_extra_balls() {
        rollStrike();
        game.Roll(3);
        game.Roll(4);
        rollMany(16, 0);
        assertEquals(24, game.Score());
    }

    @Test
    public void Perfect_game() {
        rollMany(12, 10);
        assertEquals(300, game.Score());
    }
}