package com.example.labterminal;

public abstract class Assessment {
    int obtainedMarks;
    int totalMarks;

    abstract int calculateAggregateMarks();

    public Assessment(int obtainedMarks, int totalMarks) {
        if(obtainedMarks<totalMarks){
            this.obtainedMarks = obtainedMarks;
            this.totalMarks = totalMarks;
        }

    }
}
