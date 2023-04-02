
package org.notifyPodArr.dto;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reqCode",
    "podTyp",
    "podNum",
    "callTyp"
})
@Generated("jsonschema2pojo")
public class NotifyPodArr {

    @JsonProperty("reqCode")
    private String reqCode;
    @JsonProperty("podTyp")
    private String podTyp;
    @JsonProperty("podNum")
    private String podNum;
    @JsonProperty("callTyp")
    private String callTyp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("reqCode")
    public String getReqCode() {
        return reqCode;
    }

    @JsonProperty("reqCode")
    public void setReqCode(String reqCode) {
        this.reqCode = reqCode;
    }

    @JsonProperty("podTyp")
    public String getPodTyp() {
        return podTyp;
    }

    @JsonProperty("podTyp")
    public void setPodTyp(String podTyp) {
        this.podTyp = podTyp;
    }

    @JsonProperty("podNum")
    public String getPodNum() {
        return podNum;
    }

    @JsonProperty("podNum")
    public void setPodNum(String podNum) {
        this.podNum = podNum;
    }

    @JsonProperty("callTyp")
    public String getCallTyp() {
        return callTyp;
    }

    @JsonProperty("callTyp")
    public void setCallTyp(String callTyp) {
        this.callTyp = callTyp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
