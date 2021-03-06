package aka.jmetaagents.main.tmdb.collections.collectionsimages;

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
public final class JCollectionsimagesResponse {

	@NonNull
    private List<Backdrops> backdrops = new ArrayList<>();
	@NonNull
    private List<Posters> posters = new ArrayList<>();
	@Nullable
    private Integer id;

	/**
     * Empty Constructor.
     */
    public JCollectionsimagesResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param backdropsParam List<Backdrops>
     * @param postersParam List<Posters>
     * @param idParam Integer
     */
    public JCollectionsimagesResponse(@NonNull final List<Backdrops> backdropsParam, @NonNull final List<Posters> postersParam, @Nullable final Integer idParam) {
        this.backdrops = backdropsParam;
        this.posters = postersParam;
        this.id = idParam;
    }
    
    /**
     * Get value of backdrops.
     *
     * @return List<Backdrops> value of backdrops
     */
    @NonNull
    public final List<Backdrops> getBackdrops() {
        return this.backdrops;
    }
    
    /**
     * Get value of posters.
     *
     * @return List<Posters> value of posters
     */
    @NonNull
    public final List<Posters> getPosters() {
        return this.posters;
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
     * Set value of backdrops.
     *
     * @param backdropsParam
     */
    public final void setBackdrops(@NonNull final List<Backdrops> backdropsParam) {
        this.backdrops = backdropsParam;
    }
    
    /**
     * Set value of posters.
     *
     * @param postersParam
     */
    public final void setPosters(@NonNull final List<Posters> postersParam) {
        this.posters = postersParam;
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
