package com.tnsif.nonaccessmodifiers;

final class FinalDemo { // Final class cannot be extended
    final int Max = 100; // Final variable can't be reassigned

    final void display() { // Final method can't be overridden
        System.out.println("Show the value of Max: " + Max);
    }

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.display();
        // fd.Max = 200; // ❌ Not allowed – final variable
    }
}

