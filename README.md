# Blackjack Game

![Blackjack Screenshot](https://github.com/mthaugusto/blackjack-java/blob/main/blackjack-screenshot1.png?raw=true)

## Overview
This project is a simple implementation of the popular card game Blackjack (also known as 21) in Java. It allows a player to play against a computer dealer. The game follows standard Blackjack rules where the player aims to get a hand value as close to 21 as possible without exceeding it.

## Purpose
This project was developed as part of the Domain Driven Design (DDD) class for educational purposes. It serves as a practical exercise to understand software design principles and domain modeling concepts within the context of building a playable game application.

## Rules
1. The player and the dealer are each dealt two cards initially.
2. Numbered cards are worth their face value, face cards (Jack, Queen, King) are worth 10, and Ace can be worth 1 or 11, whichever is more favorable.
3. The player can request additional cards ("Hit") or choose to stop receiving cards ("Stand").
4. If the player's hand exceeds 21 points, they "bust" and lose the round.
5. After the player stands, the dealer reveals their facedown card and draws additional cards until their hand value is 17 or higher.
6. If the dealer's hand exceeds 21 points, they bust, and the player wins the round.
7. The winner of the round is the one with the hand value closest to 21 without exceeding it.
8. In case of a tie, the round is a draw.

## Usage
To run the game, you can follow these steps:
1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Run the `Main` class.
