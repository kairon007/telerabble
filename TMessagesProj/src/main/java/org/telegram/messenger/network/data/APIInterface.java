package org.telegram.messenger.network.data;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface APIInterface {



    @GET
    Call<LoginResponse> getUser(@Url String url);

    @GET
    Call<InviteCheckResponse> getInviteCodeValidity(@Url String url);
   }