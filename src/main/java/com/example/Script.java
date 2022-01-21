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
        kcontext.setVariable("retry", 0);
        kcontext.setVariable("RetryOnError", "0");
    }

    public static void decreaseRetry(ProcessContext kcontext) {
        var retryOnError = (String) kcontext.getVariable("RetryOnError");
        var retryOnErrorInt = Integer.parseInt(retryOnError);
        ProcessWorkItemHandlerException pwihe = (ProcessWorkItemHandlerException) kcontext.getVariable("Error");
        pwihe = new ProcessWorkItemHandlerException(pwihe.getProcessId(), ProcessWorkItemHandlerException.HandlingStrategy.RETRY, pwihe.getCause(), retryOnErrorInt);
        kcontext.setVariable("Error", pwihe);                
        retryOnErrorInt--;
        kcontext.setVariable("RetryOnError", Integer.toString(retryOnErrorInt));
        kcontext.setVariable("retry", retryOnErrorInt);
   }
}