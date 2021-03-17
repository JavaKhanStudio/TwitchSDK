//package com.twitch.sdk.twitchSDK.authenticator;
//
//import org.springframework.http.client.ClientHttpRequest;
//import org.springframework.security.oauth2.core.OAuth2AccessToken;
//
//public class BearerTypeOAuth2RequestAuthenticator implements OAuth2RequestAuthenticator {
//
//    @Override
//    public void authenticate(OAuth2ProtectedResourceDetails resource, OAuth2ClientContext clientContext,
//        ClientHttpRequest request) 
//    {
//        OAuth2AccessToken accessToken = clientContext.getAccessToken();
//        if (accessToken == null) {
//            throw new AccessTokenRequiredException(resource);
//        }
//        request.getHeaders().set("Authorization", String.format("%s %s", OAuth2AccessToken.TokenType.BEARER, accessToken.getValue()));
//    }
//}