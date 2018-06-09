
package com.aws.dtos;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DominantColors implements Serializable
{

    private List<Color> colors = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7168572880424786436L;

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
