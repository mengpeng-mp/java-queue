package com.mp;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    @Test
    public void test1(){
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
    }
}
