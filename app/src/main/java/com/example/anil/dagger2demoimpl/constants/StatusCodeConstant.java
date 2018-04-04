package com.example.anil.dagger2demoimpl.constants;

/**
 * Developer: Saurabh Verma
 * Dated: 7/3/17
 */
public interface StatusCodeConstant {
    /**
     * The constant DEFAULT_STATUS_CODE.
     */
    int DEFAULT_STATUS_CODE = 900;
    /**
     * The constant UNAUTHORIZED.
     */
    int UNAUTHORIZED = 401;

    /**
     * The constant USER_NOT_FOUND.
     */
    int USER_NOT_FOUND = 404;
    /**
     * The constant SESSION_EXPIRED.
     */
    int SESSION_EXPIRED = UNAUTHORIZED;

    /**
     * The constant CONFLICT.
     */
    int CONFLICT = 409;

    /**
     * The constant GONE.
     */
    int GONE = 410;

    /**
     * The constant FORGOT_PASSWORD.
     */
    int ALREADY_EXIST = 409;

    /* ============= Booking Status ================*/

    String CANCELLED_BY_PARENT = "CANCELLED_BY_PARENT";
    String CANCELLED_BY_TUTOR = "CANCELLED_BY_TUTOR";
    String CANCELLED = "CANCELLED";

    String NEW = "NEW";
    String PENDING = "PENDING";
    String RATING = "RATING";

    String ACCEPTED_BY_ADMIN = "ACCEPTED_BY_ADMIN";
    String ACCEPTED_BY_TUTOR = "ACCEPTED_BY_TUTOR";
    String ACCEPTED_BY_PARENT = "ACCEPTED_BY_PARENT";
    String ACCEPTED = "ACCEPTED";
    String RESCHEDULE_ACCEPTED = "RESCHEDULE_ACCEPTED";
    String RESCHEDULE_REJECTED = "RESCHEDULE_REJECTED";

    String REJECTED_BY_TUTOR = "REJECTED_BY_TUTOR";
    String REJECTED_BY_PARENT = "REJECTED_BY_PARENT";
    String REJECTED = "REJECTED";

    String HOLD_FAIL = "HOLD_FAIL";
    String RESCHEDULE_REQUEST_BY_TUTOR = "RESCHEDULE_REQUEST_BY_TUTOR";
    String RESCHEDULE_REQUEST_BY_PARENT = "RESCHEDULE_REQUEST_BY_PARENT";
    String RESCHEDULE = "RESCHEDULE";
    String BOOKING_ACCEPTED = "BOOKING_ACCEPTED";

    String SESSION_STARTED = "SESSION_STARTED";
    String STARTED = "STARTED";
    String ON_THE_WAY = "ON_THE_WAY";

    String FINISHED = "FINISHED";
    String END_SESSION = "END_SESSION";


    /**
     * nothing
     */
    void nothing();
}
