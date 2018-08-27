package com.sept.android.remoteconfig.api.model;

public class ApiAdsResponse {
    public String error;
    public ApiPayload payload;
    public String sid;
    public String status;
    public long ts;

    public static class ApiAd {
        public ApiAdConfig config;
        public Boolean displayAdEnabled;
        public String name;
    }

    public static class ApiAdConfig {
        public String adTag;
        public String occurrence;
    }

    public static class ApiPayload {
        public ApiView[] views;
    }

    public static class ApiView {
        public ApiAd[] ads;
        public String name;
    }
}
