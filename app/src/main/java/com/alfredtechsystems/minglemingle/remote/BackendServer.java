package com.alfredtechsystems.minglemingle.remote;

import java.util.List;


import com.alfredtechsystems.minglemingle.model2.FetchProfileResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.android.volley.Request.Method.GET;

/**
 * Created by alfred on 21/04/18.
 */

public interface BackendServer {

    @GET("profiles/")
        Call<FetchProfileResponse> fetchProfiles();
}
