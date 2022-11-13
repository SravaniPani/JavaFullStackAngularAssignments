package com.vani;

public abstract class Concept {
    abstract void main();
}
class Reading extends Concept
{
    void main()
    {
        System.out.println(" Read the text");
    }
}
 abstract class Write extends Concept
        {
            abstract void main();
}
abstract class Detail
{
    private int age;
}
class ConceptAbstract {
    public static void main(String args[]) {
        Reading s=new Reading();
        s.main();
    }
}