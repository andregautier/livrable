package ut.com.mycompany.bitbucket.merge.checks;

import org.junit.Test;
import com.mycompany.bitbucket.merge.checks.api.MyPluginComponent;
import com.mycompany.bitbucket.merge.checks.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}