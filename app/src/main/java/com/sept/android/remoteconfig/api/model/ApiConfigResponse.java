package com.sept.android.remoteconfig.api.model;

public class ApiConfigResponse {
    public Payload payload;

    public static class Payload {
        public ApiConfigs configs;
        public String country;
    }
}
