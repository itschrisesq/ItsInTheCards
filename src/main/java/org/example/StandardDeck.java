package org.example;

import java.util.ArrayList;

public class StandardDeck extends AbstractDeck {

public StandardDeck () {
    this.cards = newDeck();
}

private List <Card> newDeck() {

    List<Card> newDeck = new ArrayList<>();

    for (Suit suit : Suit.values()) {
        for (FaceValue facevalue : StandardFaceValue.values()) {
            newDeck.add(new Card(suit, faceValue)):
        }
    }
}



}



