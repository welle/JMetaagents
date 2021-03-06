package aka.jmetaagents.main.tvdb.series.seriesidactors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the JSeriesidactorsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidactorsQuestion.class })
public class JSeriesidactorsQuestion_JUnitTest {

    /**
     * getId with an new JSeriesidactorsQuestion.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JSeriesidactorsQuestion jSeriesidactorsQuestion = mock(JSeriesidactorsQuestion.class);
        assert jSeriesidactorsQuestion != null;

        // act : run the test
        final Integer result = jSeriesidactorsQuestion.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JSeriesidactorsQuestion.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JSeriesidactorsQuestion jSeriesidactorsQuestion = mock(JSeriesidactorsQuestion.class);
        assert jSeriesidactorsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesidactorsQuestion.setId(expectedValue);
        final Integer result = jSeriesidactorsQuestion.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}