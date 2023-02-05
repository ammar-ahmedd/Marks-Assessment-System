package com.example.labterminal;

public class Assignment extends Assessment{

    public Assignment(int obtainedMarks, int totalMarks) {
        super(obtainedMarks, totalMarks);
    }

    @Override
    int calculateAggregateMarks() {
        return (obtainedMarks/totalMarks)*10;
    }
}
