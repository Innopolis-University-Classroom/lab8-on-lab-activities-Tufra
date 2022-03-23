package com.muwaffaq.innopolis.solid.SRP.wrong;

public class Discounter {
    void applyDiscount(Cart cart, int percentage) {
        cart.totals = cart.totals * percentage;
    }
}
