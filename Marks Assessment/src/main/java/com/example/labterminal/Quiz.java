package com.example.labterminal;

public class Quiz extends Assessment{
    public Quiz(int obtainedMarks, int totalMarks) {
        super(obtainedMarks, totalMarks);
    }

    @Override
    int calculateAggregateMarks() {
        return (obtainedMarks/totalMarks)*15;
    }
}
