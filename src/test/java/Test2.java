import com.gb.HW.MainHW;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test2 {

    private boolean result;
    private int[] a;

    public Test2(int[] a,boolean result) {

        this.a = a;
        this.result = result;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1, 4, 5, 1, 4, 4},false},
                { new int[]{1, 1, 4, 4},true},
                {new int[]{4, 4, 4, 4},false},
                {new int[]{ 1, 4, 4, 1, 1, 4, 3},false},
                {new int[]{1, 1, 1, 1},false}
        });
    }


    @Test
    public void test2(){
        {
            Assert.assertEquals(MainHW.OneAndFour(a), result);
        }
    }
}
