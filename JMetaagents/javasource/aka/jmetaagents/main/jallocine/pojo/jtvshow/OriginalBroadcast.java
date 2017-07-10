package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jallocine.pojo.jtvshow.deserializers.DateYearMonthDayDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class OriginalBroadcast {

    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date dateStart;

	/**
     * Empty Constructor.
     */
    public OriginalBroadcast() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dateStartParam Date
     */
    public OriginalBroadcast(@Nullable final Date dateStartParam) {
        this.dateStart = dateStartParam;
    }
    
    /**
     * Get value of dateStart.
     *
     * @return Date value of dateStart
     */
    @Nullable
    public final Date getDateStart() {
        return this.dateStart;
    }

    
    /**
     * Set value of dateStart.
     *
     * @param dateStartParam
     */
    public final void setDateStart(@Nullable final Date dateStartParam) {
        this.dateStart = dateStartParam;
    }
}
