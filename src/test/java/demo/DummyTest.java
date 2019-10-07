package demo;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class DummyTest {
    @Test
    @Parameters
    public void checkPension(int age, int expectedPension) {
        int actualPension = new Dummy().calculatePension(age);
        assertThat(actualPension, equalTo(expectedPension));
    }

    private Object parametersForCheckPension() {
        return new Object[]{
                new Object[]{1, 0},
                new Object[]{20, 1000},
                new Object[]{40, 1000},
                new Object[]{65, 10000},
        };
    }
}
