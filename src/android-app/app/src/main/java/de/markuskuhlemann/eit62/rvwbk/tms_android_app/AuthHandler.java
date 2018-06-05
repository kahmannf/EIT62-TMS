package de.markuskuhlemann.eit62.rvwbk.tms_android_app;
import io.swagger.client.model.*;
public class AuthHandler {

    private static AuthHandler _authHandler;

    private AuthHandler (){}

    public static AuthHandler getInstance(){
        if(_authHandler != null) {
            return _authHandler;
        }
        else {
            _authHandler = new AuthHandler();
            return _authHandler;
        }
    }

    private InlineResponse200 _authData;

    public InlineResponse200 getAuthData(){
        return this._authData;
    }

    public void setAuthData(InlineResponse200 data){
        this._authData = data;
    }
}
