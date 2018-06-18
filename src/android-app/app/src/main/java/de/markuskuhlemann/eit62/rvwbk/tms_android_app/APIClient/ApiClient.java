package de.markuskuhlemann.eit62.rvwbk.tms_android_app.APIClient;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.APIClient.Model.User;

import android.support.annotation.Nullable;

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
    private static final String BASE_URL = "http://127.0.0.1:8000";

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
    public User loginUser(String username, char[] password) {
        String json = "{\"Username\":\"" + username + "\",\"Password\":\"" + password + "\"}";
        String user = getJson(Endpoints.LOGIN, json);
        User loggedInUser = null;
        if (user != null) {

            loggedInUser = gson.fromJson(user, User.class);

        }
        return loggedInUser;
    }
    public User createUser(String username, char[] password)
    {
        String json = "{\"Username\":\"" + username + "\",\"Password\":\"" + password + "\"}";
        String user = getJson(Endpoints.REGISTER, json);
        User loggedInUser = null;
        if (user != null) {

            loggedInUser = gson.fromJson(user, User.class);

        }
        return loggedInUser;
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
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder().url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request)
                .execute();
             Reader reader = response.body()
                     .charStream()) {
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
    public User GetUserNew(){
        try {

            URL url = new URL("http://127.0.0.1:8080/dummy");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

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
