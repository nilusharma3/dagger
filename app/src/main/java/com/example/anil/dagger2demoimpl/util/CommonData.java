package com.example.anil.dagger2demoimpl.util;



import io.paperdb.Paper;

/**
 * Created by cl-macmini-84 on 22/11/17.
 */

public final class CommonData {

    private static final String PAPER_ACCESS_TOKEN = "paper_access_token";
    

    /**
     * Empty Constructor
     * not called
     */
    private CommonData() {
    }


    //======================================== Access Token ============================================


    /**
     * Gets access token.
     *
     * @return the access token
     */
    public static String getAccessToken() {
        return Paper.book().read(PAPER_ACCESS_TOKEN);
    }


    //======================================== FCM token ==============================================



}
