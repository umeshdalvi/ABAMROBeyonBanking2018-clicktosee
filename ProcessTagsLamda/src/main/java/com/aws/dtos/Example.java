
package com.aws.dtos;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example implements Serializable
{

    private List<Response> responses = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4107910621401908128L;

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
