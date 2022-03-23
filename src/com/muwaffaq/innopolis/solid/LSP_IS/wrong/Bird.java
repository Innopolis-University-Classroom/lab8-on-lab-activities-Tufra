package com.muwaffaq.innopolis.solid.LSP_IS.wrong;
//❌❌❌
// how many SOLID Does it Violates ?
// Fix it.
 interface Bird {
    default void fly() {
        System.out.println();
    };
    default void eat() {
        System.out.println();
    };
    default void hatch() {
        System.out.println();
    };
    default void swim() {
        System.out.println();
    };
}
