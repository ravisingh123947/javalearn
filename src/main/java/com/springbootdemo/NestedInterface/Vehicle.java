package com.springbootdemo.NestedInterface;

// Outer interface
interface Vehicle {
    void start();

    // Nested interface
    interface Engine {
        void accelerate();
        void stop();
    }
}

