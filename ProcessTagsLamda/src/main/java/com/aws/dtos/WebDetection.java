
package com.aws.dtos;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebDetection implements Serializable
{

    private List<WebEntity> webEntities = null;
    private List<BestGuessLabel> bestGuessLabels = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6514732468050989668L;

    public List<WebEntity> getWebEntities() {
        return webEntities;
    }

    public void setWebEntities(List<WebEntity> webEntities) {
        this.webEntities = webEntities;
    }

    public List<BestGuessLabel> getBestGuessLabels() {
        return bestGuessLabels;
    }

    public void setBestGuessLabels(List<BestGuessLabel> bestGuessLabels) {
        this.bestGuessLabels = bestGuessLabels;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
