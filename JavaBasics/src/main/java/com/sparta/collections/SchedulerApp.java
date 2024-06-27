package com.sparta.collections;

public class SchedulerApp {
    public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler();

        System.out.println("Task Scheduler:");
        System.out.println(taskScheduler.getNextTask());
        taskScheduler.addTask("Task 1");
        taskScheduler.addTask("Task 2");
        taskScheduler.addTask("Task 3");
        System.out.println(taskScheduler.getNextTask());
        taskScheduler.addPriorityTask("DO THIS NOW");
        taskScheduler.addTask("Task 4");
        System.out.println(taskScheduler.getNextTask());
        System.out.println(taskScheduler.getNextTask());
        System.out.println(taskScheduler.getNextTask());
        System.out.println(taskScheduler.getNextTask());
        System.out.println(taskScheduler.getNextTask());
    }
}
