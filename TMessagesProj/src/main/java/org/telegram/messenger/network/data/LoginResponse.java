package org.telegram.messenger.network.data;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private Data data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Data getData() {
        return data;
    }

    public static class Data {

        @SerializedName("user_id")
        private String userId;

        @SerializedName("token")
        private String token;

        @SerializedName("username")
        private String username;

        @SerializedName("email")
        private String email;

        public String getUserId() {
            return userId;
        }

        public String getToken() {
            return token;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }
    }
}