package org.cbioportal.model;

import java.io.Serializable;
import java.util.HashMap;

import javax.validation.constraints.NotNull;

public abstract class GenericAssayEnrichment extends ExpressionEnrichment implements Serializable {

	@NotNull
	private String stableId;
	@NotNull
	private String name;
	@NotNull
	private HashMap<String, String> genericEntityMetaProperties;

	public String getStableId() {
		return stableId;
	}

	public void setStableId(String stableId) {
		this.stableId = stableId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<String, String> getGenericEntityMetaProperties() {
		return genericEntityMetaProperties;
	}

	public void setGenericEntityMetaProperties(HashMap<String, String> genericEntityMetaProperties) {
		this.genericEntityMetaProperties = genericEntityMetaProperties;
	}

    public static int compare(GenericAssayEnrichment c1, GenericAssayEnrichment c2) {
        return c1.getpValue().compareTo(c2.getpValue());
    }
}
