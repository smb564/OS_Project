/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Supun
 */
public class Process {
    private static int processCount = 0;
    private final String name;
    private final String processId;
    private final int startingDeadline;
    private final int finishingDeadline;
    private int priority;

    public Process(int startingDeadline, int finishingDeadline , String name) {
        processId = ++processCount + "p" ;
        this.startingDeadline = startingDeadline;
        this.finishingDeadline = finishingDeadline;
        this.name = name;
    }

    public int getFinishingDeadline() {
        return finishingDeadline;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name;
    }

    public static int getProcessCount() {
        return processCount;
    }

    public String getProcessId() {
        return processId;
    }

    public int getStartingDeadline() {
        return startingDeadline;
    }
    
}
