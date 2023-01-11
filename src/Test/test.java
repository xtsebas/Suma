package Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import add.Add;

@Test
public class test {
    public void suma(){
        int result = Add.add(2,5);
        assertEquals(8, result);
    }
}
