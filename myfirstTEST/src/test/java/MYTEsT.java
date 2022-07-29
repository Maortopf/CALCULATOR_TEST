import org.junit.Assert;
import org.junit.Test;

public class MYTEsT {



    @Test
    public void Sum_test(){

        Calc1 test_1 = new Calc1();

        Assert.assertEquals(2, test_1.SUM(1, 1), 0);

    }
    @Test
    public void Div_test() {

        Calc1 test_2 = new Calc1();

        Assert.assertEquals(1, test_2.DIV(4, 4), 0);
    }
    @Test
    public void SUB_test() {

        Calc1 test_3 = new Calc1();

        Assert.assertEquals(1, test_3.SUB(4, 3), 0);
    }
    @Test
    public void MULTI_test() {

        Calc1 test_4 = new Calc1();

        Assert.assertEquals(8, test_4.MULTI(4, 2), 0);
    }
    @Test
    public void MODULU_test() {

        Calc1 test_5 = new Calc1();

        Assert.assertEquals(0, test_5.MODULU(4, 2), 0);
    }

}
