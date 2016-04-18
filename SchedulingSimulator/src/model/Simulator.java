/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Supun
 */
public class Simulator {
    private ArrayList<Process> processList;
    private ArrayList<Process> activeProcessList;
    private Process nextProcess;
    private final float finishingDeadlinePriority;
    private final float startingDeadlinePriority;

    public Simulator(float finishingDeadlinePriority, float startingDeadlinePriority) {
        this.finishingDeadlinePriority = finishingDeadlinePriority;
        this.startingDeadlinePriority = startingDeadlinePriority;
        processList = new ArrayList<>();
        activeProcessList = new ArrayList<>();
    }
    
    
    public void addProcess(String name, int startingDeadline, int finishingDeadline, int executingTime, int readyTime){
        // Create a new processID
        Process newProcess = new Process(startingDeadline, finishingDeadline, name, executingTime, readyTime);
        processList.add(newProcess);
        activeProcessList.add(newProcess);
    }
    
    public void updateProcessState(){
        int tempMaxPriority;
        activeProcessList.stream().forEach((process) -> {
            if (process.isFinished())
                activeProcessList.remove(process);
            else{
                // Set the priority from the selection algorithm
            }
        });
    }
    
    public int getPriorityFromSelectionAlgorithm(Process process){
        
    }
}
