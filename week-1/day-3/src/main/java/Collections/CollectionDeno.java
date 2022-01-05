package Collections;

import java.util.*;
import java.util.function.Consumer;

public class CollectionDeno
{
    public List<String> listDemo()
    {
        ArrayList<String> names= new ArrayList<>();
        names.add("abc");
        names.add("pqr");
        names.add("xyz");
        names.add(null);
        names.add("lmn");
        names.add("xyz");
        Consumer<String> cls=new Consumer<String>()
        {


            @Override
            public void accept(String s)
            {
                System.out.println("name is "+s);

            }
        };
        names.forEach(cls);
        Consumer<String> fn=(String s)-> System.out.println(s);
        names.forEach(fn);
        return names;
    }
    public Set<String> setDemo()
    {
        HashSet<String> set=new HashSet<>();

        set.add("abc");
        set.add("pqr");
        set.add("lmn");
        set.add("xyz");
        set.add(null);
        set.add("xyz");

        set.forEach((s)->System.out.println(s));
        return set;

}
public Queue<String> queueDemo()
{
    Queue<String> queue=new LinkedList<>();
    queue.add("abc");
    queue.add("lmn");
    queue.add("xyz");
    queue.add("pqr");
    queue.add(null);
    queue.add("xyz");
    queue.forEach(System.out::println);
    return queue;

}

    public static void main(String[] args) {
        CollectionDeno cdm=new CollectionDeno();
        cdm.listDemo();
        cdm.listDemo();
        cdm.queueDemo();
    }
}