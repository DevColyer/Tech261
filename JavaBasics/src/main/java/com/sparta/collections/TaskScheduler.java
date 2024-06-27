package com.sparta.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {
    private final Deque<String> taskQueue;

    public TaskScheduler() {
        this.taskQueue = new ArrayDeque<>();
    }

    public void addTask(String task) {
        taskQueue.addLast(task);
    }

    public void addPriorityTask(String task) {
        taskQueue.addFirst(task);
    }

    public String getNextTask() {
        if (!taskQueue.isEmpty()) return taskQueue.pollFirst();
        else return "No tasks remaining.";
    }
}
