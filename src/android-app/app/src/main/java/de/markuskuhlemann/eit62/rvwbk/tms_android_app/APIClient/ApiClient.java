package de.markuskuhlemann.eit62.rvwbk.tms_android_app.APIClient;

public class ApiClient {
    private static ApiClient client;
    public static ApiClient GetApiClient()
    {
        if(client==null)
        {
            client = new ApiClient();
        }
        return client;

    }
}
