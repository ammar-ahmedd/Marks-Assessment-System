package com.example.labterminal;

public class Examination extends Assessment{
    public Examination(int obtainedMarks, int totalMarks) {
        super(obtainedMarks, totalMarks);
    }

    @Override
    int calculateAggregateMarks() {
        return (obtainedMarks/totalMarks)*75;
    }
}
