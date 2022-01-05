package oop;

public interface GpsListener
{
    float[] locate();
    default boolean checklocation()
    {
        return locate().length==2;

    }
}
