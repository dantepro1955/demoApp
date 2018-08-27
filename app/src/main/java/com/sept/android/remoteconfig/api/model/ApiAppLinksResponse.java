package com.sept.android.remoteconfig.api.model;

public class ApiAppLinksResponse {
    public String error;
    public ApiPayload payload;
    public String sid;
    public String status;
    public int ts;

    public static class ApiPayload {
        public ApiAppLink[] appLinks;
    }
}
