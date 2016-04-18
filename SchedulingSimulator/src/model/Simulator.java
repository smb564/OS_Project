/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Supun
 */
public class Simulator {
    private final ArrayList<Process> processList;
    private final ArrayList<Process> activeProcessList;
    private final int finishingDeadlinePriority;
    private final int startingDeadlinePriority;

    public Simulator(int finishingDeadlinePriority, int startingDeadlinePriority) {
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
        activeProcessList.stream().forEach((process) -> {
            if (process.isFinished())
                activeProcessList.remove(process);
            else{
                setPriorityFromSelectionAlgorithm();
            }
        });
    }
    
    private void setPriorityFromSelectionAlgorithm(){
        // Allocate finishingTime priority
        Collections.sort(activeProcessList, Process.finishingTimeValueSort);
        for (int i = 0; i < activeProcessList.size() ; i++){
            activeProcessList.get(i).clearPriority();
            activeProcessList.get(i).addPriority((i+1) * finishingDeadlinePriority);
        }
        
        // Allcate startingTime priority
        Collections.sort(activeProcessList, Process.startindDeadlineValue);
        
        for (int i=0 ; i < activeProcessList.size() ; i++)
            activeProcessList.get(i).addPriority((i+1)*startingDeadlinePriority);
        
    }
}
