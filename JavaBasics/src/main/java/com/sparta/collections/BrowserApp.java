package com.sparta.collections;

public class BrowserApp {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        System.out.println("Browser History:");
        browserHistory.forward();
        browserHistory.visitPage("page1.com");
        browserHistory.visitPage("page2.com");
        browserHistory.visitPage("page3.com");
        browserHistory.back();
        browserHistory.back();
        browserHistory.back();
        browserHistory.forward();
        browserHistory.forward();
        browserHistory.forward();
        browserHistory.visitPage("page4.com");
        browserHistory.back();
        browserHistory.visitPage("page5.com");
        browserHistory.forward();
    }
}
