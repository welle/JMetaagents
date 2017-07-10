package aka.jmetaagents.main.jallocine.pojo.jmovie;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jallocine.pojo.jmovie.deserializers.URLDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Picture1 {

	@Nullable
    private String path;
	@Nullable
    private String name;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI href;

	/**
     * Empty Constructor.
     */
    public Picture1() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param pathParam String
     * @param nameParam String
     * @param hrefParam URI
     */
    public Picture1(@Nullable final String pathParam, @Nullable final String nameParam, @Nullable final URI hrefParam) {
        this.path = pathParam;
        this.name = nameParam;
        this.href = hrefParam;
    }
    
    /**
     * Get value of path.
     *
     * @return String value of path
     */
    @Nullable
    public final String getPath() {
        return this.path;
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
     * Get value of href.
     *
     * @return URI value of href
     */
    @Nullable
    public final URI getHref() {
        return this.href;
    }

    
    /**
     * Set value of path.
     *
     * @param pathParam
     */
    public final void setPath(@Nullable final String pathParam) {
        this.path = pathParam;
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
     * Set value of href.
     *
     * @param hrefParam
     */
    public final void setHref(@Nullable final URI hrefParam) {
        this.href = hrefParam;
    }
}
