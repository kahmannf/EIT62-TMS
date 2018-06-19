package de.markuskuhlemann.eit62.rvwbk.tms_android_app.APIClient;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.APIClient.Model.AuthDataReturn;
import de.markuskuhlemann.eit62.rvwbk.tms_android_app.APIClient.Model.Message;
import de.markuskuhlemann.eit62.rvwbk.tms_android_app.APIClient.Model.User;

import android.support.annotation.Nullable;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiClient {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String BASE_URL = "http://192.168.178.35:8000";

    private static ApiClient client;
    public static ApiClient GetApiClient()
    {
        if(client==null)
        {
            client = new ApiClient();
        }
        return client;

    }

    private static Gson gson = new Gson();


    /**
     * Gets the instance of the {@code WAServiceClient}.
     *
     * @return an instance of {@code WAServiceClient}
     */
    public AuthDataReturn loginUser(String username, String password) {
        String json = "{ \"authdata\": { \"Username\": \"" + username + "\", \"Password\": \"" + password + "\"}}";
        String user = getJson(Endpoints.LOGIN, json);
        AuthDataReturn loggedInUser = null;
        if (user != null) {

            loggedInUser = gson.fromJson(user, AuthDataReturn.class);

        }
        return loggedInUser;
    }
    public Message createUser(String username, String password)
    {

        String json = "{ \"data\": { \"Username\": \"" + username + "\", \"Password\": \"" + password + "\"}}";
        String response = getJson(Endpoints.REGISTER, json);

        if (response != null) {

            return gson.fromJson(response, Message.class);

        }
        return null;
    }

    /**
     * Peforms a POST-request to the given {@code endpoint} with the given {@code json} as the request body
     * and returns the body of the answer if the call was successful. If not, returns {@code null}.
     *
     * @param endpoint the endpoint to direct the request to
     * @param json     the json body to send
     * @return the body of the answer if the call was successful, {@code null} if not
     */
    @Nullable
    private String getJson(Endpoints endpoint, String json) {
        String url = BASE_URL + endpoint.getEndpoint();

        OkHttpClient client = new OkHttpClient();

        int i = client.writeTimeoutMillis();
        okhttp3.RequestBody body = RequestBody.create(JSON, json);
        okhttp3.Request request = new Request.Builder().url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request)
                .execute();
             Reader reader = response.body()
                     .charStream()) {
            if(response.code() == 401){return null;}
            if(response.code() == 400){return null;}
            if(response.code() == 202){
                Message message = new Message();
                message.SetText("erfolgreich regestriert");
                Gson gson = new Gson();
                return  gson.toJson(message);


            }
            char[] array = new char[8 * 1024];
            StringBuilder buffer = new StringBuilder();
            while (reader.read(array, 0, array.length) != -1) {
                buffer.append(array);
            }
            if (buffer.charAt(0) == '[') {
                buffer.deleteCharAt(0)
                        .deleteCharAt(buffer.lastIndexOf("]"));
            }
            return buffer.toString()
                    .trim();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    public enum Endpoints {
        LOGIN("/auth/login"),
        REGISTER("/auth/register"),
        REFRESH("/auth/refresh"),
        PROJECTSAVE("/secure/projects/save"),
        PROJECTSADDUSER("/secure/projects/{projectid}/add-user/{userid}"),
        PROJECTSMINE("/secure/projects/mine"),
        TICKETPROJEKT("/secure/projects/{projektid}/tickets "),
        PROJECTNEWTICKET("/secure/projects/{projektid]/new-ticket"),
        GETTICKET("/secure/tickets/{ticketid}"),
        UPDATETICKET("/secure/tickets/update"),
        ADDCOMMENT("/secure/tickets/{ticketid}/add-comment"),
        LOADUSER("/secure/users/me"),
        SEARCHUSER("/secure/users/search");

        private final String endpoint;

        private Endpoints(String endpoint) {
            this.endpoint = endpoint;
        }

        public final String getEndpoint() {
            return endpoint;
        }
    }


}
