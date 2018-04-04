package com.example.anil.dagger2demoimpl.constants;

/**
 * Developer: Saurabh Verma
 * Dated: 06/07/17
 */
public interface AppConstant {
    /**
     * The constant REQ_CODE_DEFAULT_SETTINGS.
     */
    int REQ_CODE_DEFAULT_SETTINGS = 16061;
    /**
     * The constant RC_OPEN_FILE_EXPLORER_TO_UPLOAD_FILE.
     */
    int RC_OPEN_FILE_EXPLORER_TO_UPLOAD_FILE = 10011;

    // notification related
    String NOTIFICATION_RECEIVED = "notification_received";
    String MESSAGE = "message";
    String NOTIFICATION_BOOKINGID = "bookingId";
    String NOTIFICATION_TYPE = "type";
    //status code
    int SESSION_EXPIRED = 401;
    String COUNTRY = "US";
    String DATE = "DATE";
    String DAY = "DAY";
    String MONTH = "MONTH";
    String YEAR = "YEAR";

    int REQUEST_CODE_ADD_CARD = 1003;
    int REQUEST_CODE_EDIT_CARD = 1004;
    /**
     * The constant FCM_TOKEN_RECEIVED_EVENT.
     */
    String FCM_TOKEN_RECEIVED_EVENT = "fcm_token_received_event";

    /**
     * The constant DIGITS.
     */
    String DIGITS = "0123456789";

    /**
     * The constant REGEX_MULTIPLE_SPACE.
     */
    String REGEX_MULTIPLE_SPACE = "[ ]{2,}";
    /**
     * The constant PASSWORD_LENGTH.
     */
    int PASSWORD_LENGTH = 8;

    /**
     * The constant PASSWORD_LENGTH.
     */
    int USERNAME_LENGTH = 6;
    /**
     * The constant PHONE_NUMBER_LENGTH.
     */
    int PHONE_NUMBER_LENGTH = 10;
    /**
     * The constant OTP_LENGTH.
     */
    int OTP_LENGTH = 6;
    /**
     * The constant ZIP_CODE_LENGTH.
     */
    int ZIP_CODE_LENGTH = 5;

    /**
     * The constant DEFAULT_COUNTRY_CODE.
     */
    String DEFAULT_COUNTRY_CODE = "US";

    /**
     * The constant DEVICE_TYPE.
     */
    String DEVICE_TYPE = "ANDROID";

    /**
     * The constant CURRENT_LANGUAGE.
     */
    String CURRENT_LANGUAGE = "en";

    /**
     * The constant RESEND_OTP.
     */
    String RESEND_OTP = "RESEND_OTP";

    /**
     * The constant RESEND_OTP.
     */
    String RESEND_VERIFICATION_EMAIL = "RESEND_VERIFICATION_EMAIL";
    /**
     * The constant YEARS
     */
    String YEARS = " years";
    /**
     * The constant EMPTY_STRING
     */
    String EMPTY_STRING = "";
    /**
     * The constant SIGN_IN
     */
    String SIGN_IN = "sign_in";

    /**
     * The constant FORGOT_USERNAME
     */
    String FORGOT_USERNAME = "FORGOT_USERNAME";

    /**
     * The constant FORGOT_PASSWORD
     */
    String FORGOT_PASSWORD = "FORGOT_PASSWORD";

    /**
     * The constant FORGOT_TYPE
     */
    String FORGOT_TYPE = "FORGOT_TYPE";
    /**
     * the constant thousand seconds
     */
    int NUMBER_THOUSAND = 1000;
    int SIXTY = 60;
    int TWENTY_FOUR = 24;
    /**
     * the constant GENDER
     */
    String GENDER = "GENDER";

    /**
     * the constant GRADE
     */
    String GRADE = "GRADE";

    /**
     * the constant ADD_STUDENT
     */
    String SAVE_STUDENT = "SAVE_STUDENT";

    /**
     * the constant ADD_STUDENT
     */
    String ADD_STUDENT = "ADD_STUDENT";

    /**
     * the constant EDIT_STUDENT
     */
    String EDIT_STUDENT = "EDIT_STUDENT";

    /**
     * the constant Male
     */
    String MALE = "Male";

    /**
     * the constant Female
     */
    String FEMALE = "Female";

    /**
     * The constant SIGN_UP
     */
    String SIGN_UP = "sign_up";

    /**
     * The constant TYPE_FLAT
     */
    String TYPE_FLAT = "FLAT";

    /**
     * The constant TYPE_FLAT
     */
    String TYPE_PERCENT = "PERCENT";


    /* ================ Bundle Keys ============== */
    String BUNDLE_HEADING = "BUNDLE_HEADING";
    String BUNDLE_SUB_HEADING = "BUNDLE_SUB_HEADING";
    String BUNDLE_BOLD_STRING = "BUNDLE_BOLD_STRING";
    String BUNDLE_DESCRIPTION = "BUNDLE_DESCRIPTION";
    String BUNDLE_TUTS_IMAGE = "BUNDLE_TUTS_IMAGE";
    String BUNDLE_IS_HOME_FRAGMENT = "BUNDLE_IS_HOME_FRAGMENT";


    String STREET_NUMBER_MAP = "street_number";
    String ROUTE_MAP = "route";
    String SUB_LOCALITY3_MAP = "sublocality_level_3";
    String SUB_LOCALITY2_MAP = "sublocality_level_2";
    String SUB_LOCALITY1_MAP = "sublocality_level_1";
    String CITY2_MAP = "locality";
    String CITY_MAP = "administrative_area_level_2";
    String STATE_MAP = "administrative_area_level_1";
    String COUNTRY_MAP = "country";
    String POSTAL_CODE_MAP = "postal_code";


    String RESULT_DATA_EXTRA = "result";
    String STUDENT_EXTRA = "student";
    String POSITION_EXTRA = "position";
    String ADDRESS_EXTRA = "address";

    String BUNDLE_ACTION = "BUNDLE_ACTION";
    String BUNDLE_CALLER = "bundle_caller";
    String BUNDLE_ZIPCODE = "bundle_zipcode";
    String BUNDLE_NO_LOCATION_PERM = "bundle_no_location_perm";
    String BUNDLE_DISABLE_BACK_PRESS = "bundle_disable_back_press";
    String BUNDLE_REQUEST_CODE = "bundle_request_code";
    String BUNDLE_CARD = "BUNDLE_CARD";
    String PARAM_ADD_CARD = "ADD_CARD";
    String PARAM_EDIT_CARD = "EDIT_CARD";

    String SEARCH_BY_ZIPCODE = "search_by_zipcode";
    String SEARCH_BY_NAME = "search_by_name";

    String APP_TUTOR_DATA = "APP_TUTOR_DATA";
    String TUTOR_DATA = "TUTOR_DATA";
    String CURRENCY = "$";
    String PER_HOUR = "/hr.";


    String CREATE_BOOKING_MODEL_EXTRA = "CREATE_BOOKING_MODEL_EXTRA";
    String FILTER_MODEL_EXTRA = "FILTER_MODEL_EXTRA";
    String SELECTED_SUB_SUBJECT_IDS_LIST_EXTRA = "SELECTED_SUB_SUBJECT_IDS_LIST_EXTRA";
    String SELECTED_SUBJECT_IDS_LIST_EXTRA = "SELECTED_SUBJECT_IDS_LIST_EXTRA";
    String SELECTED_NAMES_LIST_EXTRA = "SELECTED_NAMES_LIST_EXTRA";
    String SELECTED_SUBJECT_NAMES_LIST_EXTRA = "SELECTED_SUBJECT_NAMES_LIST_EXTRA";
    String CHANGE_PAYMENT_METHOD_EXTRA = "CHANGE_PAYMENT_METHOD_EXTRA";
    String IS_FOR_BOOK_ANOTHER_SESSION = "IS_FOR_BOOK_ANOTHER_SESSION";


    String PARAM_EXP_MONTH = "expMonth";
    String PARAM_EXP_YEAR = "expYear";
    String PARAM_ADDRESS_LINE1 = "addressLine1";
    String PARAM_ADDRESS_LINE2 = "addressLine2";
    String PARAM_CITY = "city";
    String PARAM_STATE = "state";
    String PARAM_ZIPCODE = "zipCode";

    int HUNDRED = 100;
    String BUNDLE_BOOKING = "BUNDLE_BOOKING";
    String BUNDLE_ISPOPUP = "isPopUp";

    String REASON_TYPE_BUNDLE = "REASON_TYPE_BUNDLE";
    String CANCEL_BOOKING_REASON = "CANCEL_BOOKING_REASON";
    String RAISE_DISPUTE_REASON = "RAISE_DISPUTE_REASON";

    String HOME = "HOME";

    /* ============= APPS FLYER ATTRIBUTE FOR DATA ================*/

    String EMAIL = "email";
    String SESSION_ID = "session_id";
    String SESSION_REVENUE = "revenue";
    String SUBJECT = "subject";
    String HOURLY_RATE = "hourly_rate";

    /**
     * The constant LIMIT.
     */
    int LIMIT = 10;

    double HALF_HOUR = 0.5;
    int SUBTRACT_YEARS = 1900;

    /**
     * nothing
     */
    void nothing();


}
