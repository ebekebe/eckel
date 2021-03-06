package com.chapter12;

public class Main {
    public static void main(String[] args){
        EmptyLink emptyLink = new EmptyLink();
        System.out.println("\n");

        ExceptionGenerator generator = new ExceptionGenerator();
        System.out.println("\n");

        TreatmentException1 treatmentException1 = new TreatmentException1();
        System.out.println("\n");

        Resumption resumption = new Resumption();
        System.out.println("\n");

        Information information = new Information();
        System.out.println("\n");

        Specification specification = new Specification();
        System.out.println("\n");

        CatchExceptionType catchExceptionType = new CatchExceptionType();
        System.out.println("\n");

        TryInTry tryInTry = new TryInTry();
        System.out.println("\n");

        Sequence sequence = new Sequence();
        System.out.println("\n");

        OnOffSwitch onOffSwitch = new OnOffSwitch();
        System.out.println("\n");

        WithFinally withFinally = new WithFinally();

        CADSystem x = new CADSystem(47);
        System.out.println("CADSystem");
        try {
            System.out.println("Returning from try block");
            return;
        } finally {
            x.dispose();
        }
    }
}
