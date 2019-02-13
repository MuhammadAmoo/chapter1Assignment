package assignment1_216022002;
import static org.hamcrest.CoreMatchers.equalTo;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Temperature_converterTest {

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void tempTest(){
        Temp t = new Temp("f", 90);
        Assert.assertThat(t.getType(), equalTo("f"));
        Assert.assertThat(t.getValue(), equalTo(90));
    }

}
