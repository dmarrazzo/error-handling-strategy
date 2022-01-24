package com.example;

import org.kie.api.runtime.process.ProcessContext;
import org.kie.api.runtime.process.ProcessWorkItemHandlerException;

public class Script {
    public static void handleStrategy(ProcessContext kcontext) {
        String strategy = (String) kcontext.getVariable("strategy");
        System.out.println(">>>>>> strategy "+strategy);
        ProcessWorkItemHandlerException pwihe = (ProcessWorkItemHandlerException) kcontext.getVariable("Error");
        pwihe = new ProcessWorkItemHandlerException(pwihe.getProcessId(), ProcessWorkItemHandlerException.HandlingStrategy.valueOf(strategy), pwihe.getCause());
        kcontext.setVariable("Error", pwihe);
    }

    public static void rethrow(ProcessContext kcontext) {
        ProcessWorkItemHandlerException pwihe = (ProcessWorkItemHandlerException) kcontext.getVariable("Error");
        pwihe = new ProcessWorkItemHandlerException(pwihe.getProcessId(), ProcessWorkItemHandlerException.HandlingStrategy.RETHROW, pwihe.getCause());
        kcontext.setVariable("Error", pwihe);
        kcontext.setVariable("RetryOnError", 0);
    }

    public static void decreaseRetry(ProcessContext kcontext) {
        var retryOnError = (Integer) kcontext.getVariable("RetryOnError");
        ProcessWorkItemHandlerException pwihe = (ProcessWorkItemHandlerException) kcontext.getVariable("Error");
        pwihe = new ProcessWorkItemHandlerException(pwihe.getProcessId(), ProcessWorkItemHandlerException.HandlingStrategy.RETRY, pwihe.getCause(), retryOnError);
        kcontext.setVariable("Error", pwihe);                
        retryOnError--;
        kcontext.setVariable("RetryOnError", retryOnError);
   }
}