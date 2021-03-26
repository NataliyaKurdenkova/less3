import com.gb.Calculator;
import com.gb.HW.MainHW;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test1 {

    private int[] b;
    private int[] a;


    public Test1(int[] b, int[] a) {
        this.b = b;
        this.a = a;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 7}, new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}},
                {new int[]{}, new int[]{1, 2, 4, 4}},
                {new int[]{1, 7, 5, 1}, new int[]{4, 4, 2, 3, 4, 1, 7, 5, 1}}
               // {new int[]{}, new int[]{7, 5, 1}}
        });
    }


    @Test
    public void test1(){
        Assert.assertArrayEquals(b, MainHW.arrFour(a));
    }
}
