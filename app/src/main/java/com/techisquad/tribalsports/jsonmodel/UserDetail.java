package com.techisquad.tribalsports.jsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserDetail {

    @SerializedName("data")
    @Expose
    private List<OneUser> data = null;
    @SerializedName("success")
    @Expose
    private Integer success;

    public List<OneUser> getData() {
        return data;
    }

    public void setData(List<OneUser> data) {
        this.data = data;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }


}
