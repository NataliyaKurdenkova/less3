import com.gb.HW.MainHW;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMetods {

    @BeforeClass
    public static void init(){
        System.out.println("@BeforeClass");
    }


    @After
    public void after(){
        System.out.println("@After");
    }

    @Test
    public void test1_1(){
        Assert.assertArrayEquals(new int[]{1, 7}, MainHW.arrFour(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test(expected = RuntimeException.class)
    public void test1_2(){
        Assert.assertArrayEquals(new int[]{}, MainHW.arrFour(new int[]{7, 5, 1}));
    }
    @Test
    public void test1_3(){
        Assert.assertArrayEquals(new int[]{1, 7, 5, 1}, MainHW.arrFour(new int[]{4, 4, 2, 3, 4, 1, 7, 5, 1}));
    }

    @Test
    public void test2_1(){
        Assert.assertEquals(false, MainHW.OneAndFour(new int[]{1, 1, 1, 4, 5, 1, 4, 4}));
    }

    @Test
    public void test2_2(){
        Assert.assertEquals(false, MainHW.OneAndFour(new int[]{1, 1, 1, 4, 5, 1, 4, 4}));
    }

    @Test
    public void test2_3(){
        Assert.assertEquals(false, MainHW.OneAndFour(new int[]{4, 4, 4, 4}));
    }
    @Test
    public void test2_4(){
        Assert.assertEquals(true, MainHW.OneAndFour(new int[]{4, 4, 4, 4,1}));
    }
}

