package com.samsung.ax.restful.common;

/**
 * 
 * @author heesik.jeon
 *
 */

public class Constant {
    
    public static final String COOKIE_USER_KEY = "Ax";
    public static final String COOKIE_USER_SECRET = "cookie.secret";
    
//    public static final String COOKIE_DOMAIN = ".samsung.com"; // TODO Need to change it to your domain
    public static final String COOKIE_URI = "/";
    public static final int COOKIE_MAX_AGE = 60 * 60 * 6; // 6 hours
    public static final int COOKIE_EXPIRY = 0;

    public static final String PROPERTIES_CLASSPATH = "/config/restful.properties";
    
    public static final String LIST_MAX_RESULTS = "maxResults";
    public static final String LIST_MAX_PAGING = "maxPaging";

    public static final String USER_WSSID_KEY = "wssid";
    public static final int USER_WSSID_RAMDOM_COUNT = 8;
    
    public static final int USER_BASE_NUMERAL_SYSTEM = 62;
    public static final int USER_SID_BASE_VALUE = 238328;

    public static final int USER_NAME_MIN_LENGTH = 3;
    public static final int USER_NAME_MAX_LENGTH = 15;
    
    public static final String NOTE_IDX = "idx";
    public static final String NOTE_SUBJECT = "subject";
    public static final String NOTE_CONTENT = "content";

    public static final String FILE_BASE_PATH = "/usr/local/share/bbs/"; // TODO Need to change it to your filepath
    public static final int FILE_BASE_DEPTH = 2;
    
    
    public static final String ERR_SYSTEM_ERROR = "err.system.error";

    public static final String ERR_DATA_ACCESS = "err.data.access";

    public static final String ERR_USER_NAME_DUPLICATED = "err.user.name.duplicated";
    public static final String ERR_USER_NAME_PATTERN = "err.user.name.pattern";
    public static final String ERR_USER_NAME_LENGTH = "err.user.name.length";
    
    public static final String ERR_USER_NOT_FOUND = "err.user.not.found";
    public static final String ERR_USER_LOGIN_FAILED = "err.user.login.failed";
    public static final String ERR_USER_AUTHENTICATION_FAILED = "err.user.authentication.failed";
    public static final String ERR_USER_AUTHORIZATION_FAILED = "err.user.authorization.failed";
    
    public static final String ERR_FILE_MISSING = "err.file.missing";

    public static final String ERR_MANDATORY_MISSING = "err.mandatory.missing";

}