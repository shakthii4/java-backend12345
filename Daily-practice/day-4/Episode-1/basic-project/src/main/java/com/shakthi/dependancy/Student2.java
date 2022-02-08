package com.shakthi.dependancy;

public class Student2
{
    MathCheat mathCheat;   //default value is null

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void cheatting()
    {
        mathCheat.mathCheat();
    }
}
