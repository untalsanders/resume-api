package com.sandersgutierrez.resume;

public class ResumeApplication {
    public String getGreeting(String name) {
        return String.format("Hello %s!", name);
    }

    public static void main(String[] args) {
        System.out.println(new ResumeApplication().getGreeting("Sanders"));
    }
}
