
package com.tramonti.weather.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Sys {

    @SerializedName("pod")
    @Expose
    public String pod;

}