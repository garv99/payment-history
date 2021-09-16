package com.assignment.onebanc.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Requests {

    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("receipeintId")
    @Expose
    private Integer receipeintId;
    @SerializedName("transactions")
    @Expose
    private List<Transaction> transactions = null;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getReceipeintId() {
        return receipeintId;
    }

    public void setReceipeintId(Integer receipeintId) {
        this.receipeintId = receipeintId;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}