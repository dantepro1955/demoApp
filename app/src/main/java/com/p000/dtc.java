package com.p000;

import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;

/* compiled from: QueryParams */
/* renamed from: dtc */
public enum dtc {
    SITE_ID("idsite"),
    RECORD("rec"),
    URL_PATH("url"),
    ACTION_NAME("action_name"),
    VISITOR_ID(AnalyticsSQLiteHelper.GENERAL_ID),
    RANDOM_NUMBER("rand"),
    API_VERSION("apiv"),
    REFERRER("urlref"),
    VISIT_SCOPE_CUSTOM_VARIABLES("_cvar"),
    TOTAL_NUMBER_OF_VISITS("_idvc"),
    PREVIOUS_VISIT_TIMESTAMP("_viewts"),
    FIRST_VISIT_TIMESTAMP("_idts"),
    CAMPAIGN_NAME("_rcn"),
    CAMPAIGN_KEYWORD("_rck"),
    SCREEN_RESOLUTION("res"),
    HOURS("h"),
    MINUTES("m"),
    SECONDS("s"),
    USER_AGENT("ua"),
    LANGUAGE("lang"),
    USER_ID("uid"),
    SESSION_START("new_visit"),
    SCREEN_SCOPE_CUSTOM_VARIABLES("cvar"),
    LINK("link"),
    DOWNLOAD(AdTrackerConstants.GOAL_DOWNLOAD),
    SEARCH_KEYWORD("search"),
    SEARCH_CATEGORY("search_cat"),
    SEARCH_NUMBER_OF_HITS("search_count"),
    GOAL_ID("idgoal"),
    REVENUE("revenue"),
    AUTHENTICATION_TOKEN("token_auth"),
    COUNTRY("country"),
    LATITUDE("lat"),
    LONGITUDE("long"),
    DATETIME_OF_REQUEST("cdt"),
    CONTENT_NAME("c_n"),
    CONTENT_PIECE("c_p"),
    CONTENT_TARGET("c_t"),
    CONTENT_INTERACTION("c_i"),
    EVENT_CATEGORY("e_c"),
    EVENT_ACTION("e_a"),
    EVENT_NAME("e_n"),
    EVENT_VALUE("e_v"),
    ECOMMERCE_ITEMS("ec_items"),
    TAX("ec_tx"),
    ORDER_ID("ec_id"),
    SHIPPING("ec_sh"),
    DISCOUNT("ec_dt"),
    SUBTOTAL("ec_st"),
    SEND_IMAGE("send_image");
    
    /* renamed from: Y */
    private final String f16830Y;

    private dtc(String str) {
        this.f16830Y = str;
    }

    public String toString() {
        return this.f16830Y;
    }
}
