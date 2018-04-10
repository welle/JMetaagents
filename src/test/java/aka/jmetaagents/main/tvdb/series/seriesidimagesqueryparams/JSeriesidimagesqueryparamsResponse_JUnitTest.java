package aka.jmetaagents.main.tvdb.series.seriesidimagesqueryparams;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the JSeriesidimagesqueryparamsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidimagesqueryparamsResponse.class })
public class JSeriesidimagesqueryparamsResponse_JUnitTest {

    /**
     * getData with an new JSeriesidimagesqueryparamsResponse.
     */
    @org.junit.Test
    public void testGetData() {
        // arrange : set up the test
        final JSeriesidimagesqueryparamsResponse jSeriesidimagesqueryparamsResponse = mock(JSeriesidimagesqueryparamsResponse.class);
        assert jSeriesidimagesqueryparamsResponse != null;

        // act : run the test
        final List result = jSeriesidimagesqueryparamsResponse.getData();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setData with an new JSeriesidimagesqueryparamsResponse.
     */
    @org.junit.Test
    public void testSetData() {
        // arrange : set up the test
        final JSeriesidimagesqueryparamsResponse jSeriesidimagesqueryparamsResponse = mock(JSeriesidimagesqueryparamsResponse.class);
        assert jSeriesidimagesqueryparamsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Data> expectedValue = new ArrayList<>();
        Data dataItem = new Data();
        expectedValue.add(dataItem);
        jSeriesidimagesqueryparamsResponse.setData(expectedValue);
        final List<Data> result = jSeriesidimagesqueryparamsResponse.getData();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}