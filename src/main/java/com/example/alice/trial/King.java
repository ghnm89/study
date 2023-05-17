package com.example.alice.trial;

public class King implements Judge {

    @Override
    public void callWitness(Rabbit rabbit, Witness witness) {
        rabbit.orderWitnessEnter(witness);
    }

    @Override
    public String orderTestify(Witness witness) {
        return witness.testify();
    }

}
