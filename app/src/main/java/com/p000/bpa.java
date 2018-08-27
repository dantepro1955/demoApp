package com.p000;

import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;

/* renamed from: bpa */
public enum bpa {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR(NativeProtocol.ERROR_NETWORK_ERROR),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    BAD_AUTHENTICATION("BadAuthentication"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED(NativeProtocol.ERROR_SERVICE_DISABLED),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED(NativeProtocol.ERROR_PERMISSION_DENIED),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_SCREENLOCK_REQUIRED("DeviceManagementScreenlockRequired"),
    DM_REQUIRED("DeviceManagementRequired"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError");
    
    private final String ab;

    private bpa(String str) {
        this.ab = str;
    }

    /* renamed from: a */
    public static final bpa m10225a(String str) {
        bpa bpa = null;
        bpa[] values = bpa.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            bpa bpa2 = values[i];
            if (!bpa2.ab.equals(str)) {
                bpa2 = bpa;
            }
            i++;
            bpa = bpa2;
        }
        return bpa;
    }

    /* renamed from: a */
    public static boolean m10226a(bpa bpa) {
        return BAD_AUTHENTICATION.equals(bpa) || CAPTCHA.equals(bpa) || NEED_PERMISSION.equals(bpa) || NEED_REMOTE_CONSENT.equals(bpa) || NEEDS_BROWSER.equals(bpa) || USER_CANCEL.equals(bpa) || DEVICE_MANAGEMENT_REQUIRED.equals(bpa) || DM_INTERNAL_ERROR.equals(bpa) || DM_SYNC_DISABLED.equals(bpa) || DM_ADMIN_BLOCKED.equals(bpa) || DM_ADMIN_PENDING_APPROVAL.equals(bpa) || DM_STALE_SYNC_REQUIRED.equals(bpa) || DM_DEACTIVATED.equals(bpa) || DM_REQUIRED.equals(bpa) || THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(bpa) || DM_SCREENLOCK_REQUIRED.equals(bpa);
    }

    /* renamed from: b */
    public static boolean m10227b(bpa bpa) {
        return NETWORK_ERROR.equals(bpa) || SERVICE_UNAVAILABLE.equals(bpa);
    }
}
