
package com.aws.dtos;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ImagePropertiesAnnotation implements Serializable
{

    private DominantColors dominantColors;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1956229634657732678L;

    public DominantColors getDominantColors() {
        return dominantColors;
    }

    public void setDominantColors(DominantColors dominantColors) {
        this.dominantColors = dominantColors;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
