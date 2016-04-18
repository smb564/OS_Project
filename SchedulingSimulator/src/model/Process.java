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
public class Process{
    private static int processCount = 0;
    private final String name;
    private final String processId;
    private final int startingDeadline;
    private final int finishingDeadline;
    private int priority;
    private boolean finished;
    private final int executingTime;
    private int remainingTime;
    private final int readyTime;

    public Process(int startingDeadline, int finishingDeadline , String name, int executingTime, int readyTime) {
        processId = ++processCount + "p" ;
        this.startingDeadline = startingDeadline;
        this.finishingDeadline = finishingDeadline;
        this.name = name;
        finished = false;
        this.executingTime = executingTime;
        this.readyTime = readyTime;
    }

    public int getReadyTime() {
        return readyTime;
    }

    public int getExecutingTime() {
        return executingTime;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public int getFinishingDeadline() {
        return finishingDeadline;
    }
    
    public void execute(int executionTime){
        remainingTime -= executionTime;
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

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean isFinished() {
        return finished;
    }
    
    // The following code block is used to sort 
    
}
