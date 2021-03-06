package aka.jmetaagents.main.tvdb.series.seriesidfilter;

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
 * JUnit skeleton for the JSeriesidfilterResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidfilterResponse.class })
public class JSeriesidfilterResponse_JUnitTest {

    /**
     * getData with an new JSeriesidfilterResponse.
     */
    @org.junit.Test
    public void testGetData() {
        // arrange : set up the test
        final JSeriesidfilterResponse jSeriesidfilterResponse = mock(JSeriesidfilterResponse.class);
        assert jSeriesidfilterResponse != null;

        // act : run the test
        final Data result = jSeriesidfilterResponse.getData();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setData with an new JSeriesidfilterResponse.
     */
    @org.junit.Test
    public void testSetData() {
        // arrange : set up the test
        final JSeriesidfilterResponse jSeriesidfilterResponse = mock(JSeriesidfilterResponse.class);
        assert jSeriesidfilterResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Data expectedValue = null;
        jSeriesidfilterResponse.setData(expectedValue);
        final Data result = jSeriesidfilterResponse.getData();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getErrors with an new JSeriesidfilterResponse.
     */
    @org.junit.Test
    public void testGetErrors() {
        // arrange : set up the test
        final JSeriesidfilterResponse jSeriesidfilterResponse = mock(JSeriesidfilterResponse.class);
        assert jSeriesidfilterResponse != null;

        // act : run the test
        final Errors result = jSeriesidfilterResponse.getErrors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setErrors with an new JSeriesidfilterResponse.
     */
    @org.junit.Test
    public void testSetErrors() {
        // arrange : set up the test
        final JSeriesidfilterResponse jSeriesidfilterResponse = mock(JSeriesidfilterResponse.class);
        assert jSeriesidfilterResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Errors expectedValue = null;
        jSeriesidfilterResponse.setErrors(expectedValue);
        final Errors result = jSeriesidfilterResponse.getErrors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}