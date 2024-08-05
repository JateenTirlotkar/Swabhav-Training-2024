package com.test;

import java.util.Scanner;
import com.model.CricketPlayer;

public class CricketPlayerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many players you want: ");
        int num = sc.nextInt();
        CricketPlayer cricketPlayers[] = new CricketPlayer[num];

        for (int i = 0; i < cricketPlayers.length; i++) {
            System.out.println("Enter PlayerId: ");
            int playerId = sc.nextInt();
            System.out.println("Enter Player Name: ");
            String name = sc.next();
            System.out.println("Enter Number Of Matches Played: ");
            int numberOfMatches = sc.nextInt();
            System.out.println("Enter Runs Scored: ");
            int runs = sc.nextInt();
            System.out.println("Enter Wickets Taken: ");
            int wickets = sc.nextInt();

            cricketPlayers[i] = new CricketPlayer(playerId, name, numberOfMatches, runs, wickets);
        }

        CricketPlayer maxAveragePlayer = getMaximumAveragePlayer(cricketPlayers);
        System.out.println("Player with the maximum average:");
        maxAveragePlayer.display();
        System.out.println("Average: " + maxAveragePlayer.calculateAverage());
        System.out.println();

        displayPlayers(cricketPlayers);

        sc.close();
    }

    public static CricketPlayer getMaximumAveragePlayer(CricketPlayer[] players) {
        CricketPlayer maxPlayer = players[0];
        for (int i = 1; i < players.length; i++) {
            if (players[i].calculateAverage() > maxPlayer.calculateAverage()) {
                maxPlayer = players[i];
            }
        }
        return maxPlayer;
    }

    public static void displayPlayers(CricketPlayer players[]) {
        for (int i = 0; i < players.length - 1; i++) {
            for (int j = i + 1; j < players.length; j++) {
                if (players[i].calculateAverage() > players[j].calculateAverage()) {
                    CricketPlayer temp = players[i];
                    players[i] = players[j];
                    players[j] = temp;
                }
            }
        }

        System.out.println("Players in ascending order of average:");
        for (CricketPlayer player : players) {
            player.display();
            System.out.println("Average: " + player.calculateAverage());
            System.out.println();
        }
    }
}
