package com.assignment.onebanc;

import com.assignment.onebanc.response.Requests;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface gitApi {

    @GET("GetTransactionHistory")
    Call<Requests> loadChanges(@Query("userId") String userId, @Query("recipientId") String recipientId);

}
