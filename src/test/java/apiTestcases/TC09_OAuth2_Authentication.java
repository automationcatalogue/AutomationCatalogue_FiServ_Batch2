package apiTestcases;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC09_OAuth2_Authentication {

    // OAuth 2.0 endpoints
    private static final String AUTH_SERVER = "https://authorization-server.com";
    private static final String TOKEN_ENDPOINT = AUTH_SERVER + "/token";
    private static final String CLIENT_ID = "your-client-id";
    private static final String CLIENT_SECRET = "your-client-secret";
    private static final String REDIRECT_URI = "https://your-redirect-uri.com";
    private static final String SCOPE = "read write";
    private static final String USERNAME = "your-username";
    private static final String PASSWORD = "your-password";
    private static final String API_ENDPOINT = "https://api.example.com/data";

    public static void main(String[] args) {
        // Step 1: Obtain Authorization Code
        String authorizationCode = obtainAuthorizationCode();

        // Step 2: Exchange Authorization Code for Access Token
        String accessToken = exchangeAuthorizationCodeForAccessToken(authorizationCode);

        // Step 3: Use Access Token to Access Resources
        useAccessTokenToAccessResources(accessToken);
    }

    private static String obtainAuthorizationCode() {
        RestAssured.baseURI = AUTH_SERVER;

        // Redirect the user to the authorization server to obtain an authorization code
        String authorizationCode =
                RestAssured.given()
                        .redirects().follow(false)
                        .queryParam("response_type", "code")
                        .queryParam("client_id", CLIENT_ID)
                        .queryParam("redirect_uri", REDIRECT_URI)
                        .queryParam("scope", SCOPE)
                        .get("/authorize")
                        .then()
                        .statusCode(302)
                        .extract()
                        .header("Location")
                        .split("code=")[1];

        return authorizationCode;
    }

    private static String exchangeAuthorizationCodeForAccessToken(String authorizationCode) {
        // Exchange the obtained authorization code for an access token
        Response response =
                RestAssured.given()
                        .formParam("grant_type", "authorization_code")
                        .formParam("code", authorizationCode)
                        .formParam("client_id", CLIENT_ID)
                        .formParam("client_secret", CLIENT_SECRET)
                        .formParam("redirect_uri", REDIRECT_URI)
                        .when()
                        .post(TOKEN_ENDPOINT);

        String accessToken = response.jsonPath().getString("access_token");
        return accessToken;
    }

    private static void useAccessTokenToAccessResources(String accessToken) {
        // Use the obtained access token to access protected resources
        RestAssured.baseURI = API_ENDPOINT;

        RestAssured.given()
                .auth().oauth2(accessToken)
                .when()
                .get("/resource")
                .then()
                .statusCode(200);
    }

}
