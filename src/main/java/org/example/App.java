package org.example;

import lombok.RequiredArgsConstructor;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

@RequiredArgsConstructor
class Test {
    private final int i; // pmd should trigger for this unused field
}
