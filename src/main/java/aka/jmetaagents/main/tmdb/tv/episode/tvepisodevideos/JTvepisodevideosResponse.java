package aka.jmetaagents.main.tmdb.tv.episode.tvepisodevideos;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTvepisodevideosResponse {

	@Nullable
    private Integer id;
	@NonNull
    private List<Results> results = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JTvepisodevideosResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param idParam Integer
     * @param resultsParam List<Results>
     */
    public JTvepisodevideosResponse(@Nullable final Integer idParam, @NonNull final List<Results> resultsParam) {
        this.id = idParam;
        this.results = resultsParam;
    }
    
    /**
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
    }
    
    /**
     * Get value of results.
     *
     * @return List<Results> value of results
     */
    @NonNull
    public final List<Results> getResults() {
        return this.results;
    }

    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of results.
     *
     * @param resultsParam
     */
    public final void setResults(@NonNull final List<Results> resultsParam) {
        this.results = resultsParam;
    }
}
