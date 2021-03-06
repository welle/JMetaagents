package aka.jmetaagents.main.tmdb.movies.moviesdetails;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Genres {

	@Nullable
    private String name;
	@Nullable
    private Integer id;

	/**
     * Empty Constructor.
     */
    public Genres() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param nameParam String
     * @param idParam Integer
     */
    public Genres(@Nullable final String nameParam, @Nullable final Integer idParam) {
        this.name = nameParam;
        this.id = idParam;
    }
    
    /**
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
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
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
}
