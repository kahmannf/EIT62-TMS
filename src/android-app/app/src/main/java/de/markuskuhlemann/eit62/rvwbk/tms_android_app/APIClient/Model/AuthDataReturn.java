package de.markuskuhlemann.eit62.rvwbk.tms_android_app.APIClient.Model;

public class AuthDataReturn {
    String token;
    String refresh_token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
