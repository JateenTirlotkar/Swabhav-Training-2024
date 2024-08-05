//package com.model;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//class GameTest {
//    GameFacade game;
//    Player player1;
//    Player player2;
//    ByteArrayOutputStream outContent;
//
//    @BeforeEach
//    void init() {
//        player1 = new Player("Player 1", 'X');
//        player2 = new Player("Player 2", 'O');
//        game = new GameFacade(player1, player2);
//        outContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outContent));
//    }
//
//    @AfterEach
//    void status() {
//        System.setOut(System.out);
//        System.out.println("Test Finished");
//    }
//
//    @Test
//    void testBoardConstructor() {
//        Board board = new Board();
//        char[][] expectedGrid = {
//            {'-', '-', '-'},
//            {'-', '-', '-'},
//            {'-', '-', '-'}
//        };
//        assertArrayEquals(expectedGrid, board.getGrid(), "Board constructor should initialize the grid correctly");
//    }
//
//    @Test
//    void testPrintBoard() {
//        Board board = new Board();
//        String expectedOutput = "- - - \n- - - \n- - - \n";
//        board.printBoard();
//        assertEquals(expectedOutput, outContent.toString(), "Print board should display an empty grid");
//    }
//
//    @Test
//    void testMakeMoveValid() {
//        game.startGame(); // Initialize and print the board
//        boolean moveMade = game.makeMove(0, 0);
//        assertTrue(moveMade, "Valid move should return true");
//        assertEquals('X', game.getBoard().getGrid()[0][0], "The board should have 'X' at position (0, 0)");
//    }
//
//    @Test
//    void testMakeMoveInvalid() {
//        game.startGame(); // Initialize and print the board
//        game.makeMove(0, 0);
//        boolean moveMade = game.makeMove(0, 0); // Try to place at the same spot
//        assertFalse(moveMade, "Invalid move should return false");
//    }
//}
