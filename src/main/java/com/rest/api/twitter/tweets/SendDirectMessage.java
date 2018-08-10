package com.rest.api.twitter.tweets;

import twitter4j.DirectMessage;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;


public class SendDirectMessage {

  private static final String TWITTER_CONSUMER_KEY = "HKY9C6MoHzqF2NE0vcgKm0f2c";
  private static final String TWITTER_SECRET_KEY = "nfCBrun4z2E7igv6I5DeulVJKbSj8VuQmf9gHcD9pSlQAL1F4Q";
  private static final String TWITTER_ACCESS_TOKEN = "175862794-iuSOT0Z7oIpUzemsmnAOsWXbAFXapIRqTjkwXUzr";
  private static final String TWITTER_ACCESS_TOKEN_SECRET = "dJGDj0w1aT34UvLNFfTF2X2n1sHgIg3bQISs6wPmJYKMZ";

  public static void main(String[] args) {


      Twitter twitter = new TwitterFactory().getInstance();

      AccessToken accessToken = new AccessToken(TWITTER_ACCESS_TOKEN, TWITTER_ACCESS_TOKEN_SECRET);
      twitter.setOAuthConsumer(TWITTER_CONSUMER_KEY, TWITTER_SECRET_KEY);
      twitter.setOAuthAccessToken(accessToken);

      String usuario = "@Kenelmita";
      String mensaje = "Hola kenelmita, estoy desde la API :) ";

      try {
        DirectMessage message = twitter.sendDirectMessage(usuario, mensaje);
        System.out.println("Direct message successfully sent to " + message.getRecipientScreenName());
        System.exit(0);
      } catch (TwitterException te) {
        te.printStackTrace();
        System.out.println("Failed to send a direct message: " + te.getMessage());
        System.exit(-1);
      }

    }
}