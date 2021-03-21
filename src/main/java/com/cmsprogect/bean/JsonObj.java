package com.cmsprogect.bean;

import java.util.List;

public class JsonObj {
    private String errorCode ="0";
    private String errorMessage="成功";
    private List row;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List getRow() {
        return row;
    }

    public void setRow(List row) {
        this.row = row;
    }

    public JsonObj resultWithoutRow(String errorCode,String errorMessage){
        JsonObj jsonObj = new JsonObj();
        jsonObj.errorCode=errorCode;
        jsonObj.errorMessage=errorMessage;
        return jsonObj;
    }
}
