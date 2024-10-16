package org.telegram.messenger.network.data;

import com.google.gson.annotations.SerializedName;

public class InviteCheckResponse {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("invite_code")
    private String inviteCode;

    @SerializedName("data")
    private Data data;
    public String getInviteCode() {
        return inviteCode;
    }
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
        @SerializedName("valid")
        private boolean valid;

        public boolean isValid() {
            return valid;
        }
    }
}