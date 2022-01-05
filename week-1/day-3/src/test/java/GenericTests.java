import Generics.GenericBox;
import Generics.NormalBox;
import com.sun.org.apache.xpath.internal.operations.String;
import oop.Tiger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class GenericTests
{
    @DisplayName("Test who is parent of all")
    @Test
    void testParentOfAll()
    {
        Object o1=new String();
        Object o2=new Tiger();
        Object o3=new Date();
        Object o4=new Calendar.getInstance();
        Assertions.assertNotNull(o1);
        Assertions.assertNotNull(o2);
        Assertions.assertNotNull(o3);
        Assertions.assertNotNull(o4);

    }
    void testNormalBox()
    {
        var nb=new NormalBox();
        nb.setContent("this is string");
        var actual=nb.getContent() instanceof java.lang.String;
        Assertions.assertTrue(actual);

        nb.setContent(new Date());
        actual=nb.getContent() instanceof Date;
        Assertions.assertTrue(actual);

        nb.setContent(new Tiger());
        actual=nb.getContent() instanceof Tiger;
        Assertions.assertTrue(actual);
    }
    @DisplayName("Testing Generic Box -String")
    @Test
    void testGenericBoxString()
    {
        @DisplayName("hi")
        @Test
        void testGenericBoxString()
    {
        GenericBox<String> gb1 = new GenericBox<String>();
        gb1.setContent("hello");
        Assertions.assertTrue(gb1.getContent() instanceof String);
    }


        void testGenericBoxTiger()
    {
        GenericBox.GenericBox<Tiger> gb2 = new GenericBox<Tiger>();
        gb2.setContent(new Tiger());
        Assertions.assertTrue(gb2.getContent() instanceof Tiger);
    }

    }




}
