package com.sept.android.remoteconfig.api.model;

public class ApiBroadcastsResponse {
    public Payload payload;

    public static class Payload {
        public ApiBroadcast[] messages;
    }
}
