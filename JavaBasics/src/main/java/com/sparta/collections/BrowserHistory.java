package com.sparta.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private final Deque<String> backStack;
    private final Deque<String> forwardStack;
    private String currentPage;

    public BrowserHistory() {
        this.backStack = new ArrayDeque<>();
        this.forwardStack = new ArrayDeque<>();
        this.currentPage = null;
    }

    public void visitPage(String url) {
        if (currentPage != null)
            backStack.push(currentPage);

        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited " + url);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to " + currentPage);
        } else {
            System.out.println("No pages in back history.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to " + currentPage);
        } else {
            System.out.println("No pages in forward history.");
        }
    }
}
