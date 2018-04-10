package aka.jmetaagents.main.tmdb.tv.tvrecommandations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the Results object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Results.class })
public class Results_JUnitTest {

    /**
     * getFirstAirDate with an new Results.
     */
    @org.junit.Test
    public void testGetFirstAirDate() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final Date result = results.getFirstAirDate();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFirstAirDate with an new Results.
     */
    @org.junit.Test
    public void testSetFirstAirDate() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        results.setFirstAirDate(expectedValue);
        final Date result = results.getFirstAirDate();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOverview with an new Results.
     */
    @org.junit.Test
    public void testGetOverview() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getOverview();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOverview with an new Results.
     */
    @org.junit.Test
    public void testSetOverview() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setOverview(expectedValue);
        final String result = results.getOverview();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOriginalLanguage with an new Results.
     */
    @org.junit.Test
    public void testGetOriginalLanguage() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getOriginalLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginalLanguage with an new Results.
     */
    @org.junit.Test
    public void testSetOriginalLanguage() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setOriginalLanguage(expectedValue);
        final String result = results.getOriginalLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenreIds with an new Results.
     */
    @org.junit.Test
    public void testGetGenreIds() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final List result = results.getGenreIds();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenreIds with an new Results.
     */
    @org.junit.Test
    public void testSetGenreIds() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        results.setGenreIds(expectedValue);
        final List<String> result = results.getGenreIds();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPosterPath with an new Results.
     */
    @org.junit.Test
    public void testGetPosterPath() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getPosterPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPosterPath with an new Results.
     */
    @org.junit.Test
    public void testSetPosterPath() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setPosterPath(expectedValue);
        final String result = results.getPosterPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOriginCountry with an new Results.
     */
    @org.junit.Test
    public void testGetOriginCountry() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final List result = results.getOriginCountry();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginCountry with an new Results.
     */
    @org.junit.Test
    public void testSetOriginCountry() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        results.setOriginCountry(expectedValue);
        final List<String> result = results.getOriginCountry();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBackdropPath with an new Results.
     */
    @org.junit.Test
    public void testGetBackdropPath() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getBackdropPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBackdropPath with an new Results.
     */
    @org.junit.Test
    public void testSetBackdropPath() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setBackdropPath(expectedValue);
        final String result = results.getBackdropPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOriginalName with an new Results.
     */
    @org.junit.Test
    public void testGetOriginalName() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getOriginalName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginalName with an new Results.
     */
    @org.junit.Test
    public void testSetOriginalName() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setOriginalName(expectedValue);
        final String result = results.getOriginalName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPopularity with an new Results.
     */
    @org.junit.Test
    public void testGetPopularity() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final Double result = results.getPopularity();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPopularity with an new Results.
     */
    @org.junit.Test
    public void testSetPopularity() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        results.setPopularity(expectedValue);
        final Double result = results.getPopularity();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteAverage with an new Results.
     */
    @org.junit.Test
    public void testGetVoteAverage() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final Double result = results.getVoteAverage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteAverage with an new Results.
     */
    @org.junit.Test
    public void testSetVoteAverage() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        results.setVoteAverage(expectedValue);
        final Double result = results.getVoteAverage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new Results.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Results.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setName(expectedValue);
        final String result = results.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Results.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final Integer result = results.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Results.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        results.setId(expectedValue);
        final Integer result = results.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteCount with an new Results.
     */
    @org.junit.Test
    public void testGetVoteCount() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final Integer result = results.getVoteCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteCount with an new Results.
     */
    @org.junit.Test
    public void testSetVoteCount() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        results.setVoteCount(expectedValue);
        final Integer result = results.getVoteCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}