package com.example.anil.dagger2demoimpl.retrofit;


import static com.example.anil.dagger2demoimpl.constants.StatusCodeConstant.DEFAULT_STATUS_CODE;
import static com.example.anil.dagger2demoimpl.retrofit.ResponseResolver.UNEXPECTED_ERROR_OCCURRED;

/**
 * Developer: Saurabh Verma
 * Dated: 7/3/17
 */
public class APIError {
    private final int statusCode;
    private final String message;

    /**
     * Instantiates a new Api error.
     *
     * @param statusCode status code of api error response
     * @param message    message of api error response
     */
    public APIError(final int statusCode, final String message) {
        this.message = message;
        this.statusCode = statusCode;
    }

    /**
     * Gets status code.
     *
     * @return status code of api error response
     */
    public int getStatusCode() {
        if (statusCode == 0) {
            return DEFAULT_STATUS_CODE;
        }
        return statusCode;
    }

    /**
     * Gets message.
     *
     * @return message of api error response
     */
    public String getMessage() {
        if (message == null) {
            return UNEXPECTED_ERROR_OCCURRED;
        } else {
            return message;
        }
    }
}
