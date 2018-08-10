package com.rest.api.twitter.trends;

import twitter4j.*;
import twitter4j.auth.AccessToken;

public class GetAvailableTrends {

  private static final String TWITTER_CONSUMER_KEY = "HKY9C6MoHzqF2NE0vcgKm0f2c";
  private static final String TWITTER_SECRET_KEY = "nfCBrun4z2E7igv6I5DeulVJKbSj8VuQmf9gHcD9pSlQAL1F4Q";
  private static final String TWITTER_ACCESS_TOKEN = "175862794-iuSOT0Z7oIpUzemsmnAOsWXbAFXapIRqTjkwXUzr";
  private static final String TWITTER_ACCESS_TOKEN_SECRET = "dJGDj0w1aT34UvLNFfTF2X2n1sHgIg3bQISs6wPmJYKMZ";


  public static void main(String[] args) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(TWITTER_ACCESS_TOKEN, TWITTER_ACCESS_TOKEN_SECRET);
    twitter.setOAuthConsumer(TWITTER_CONSUMER_KEY, TWITTER_SECRET_KEY);
    twitter.setOAuthAccessToken(accessToken);

    try {
      ResponseList<Location> locations;
      locations = twitter.getAvailableTrends();
      System.out.println("Showing available trends");
      for (Location location : locations) {
        System.out.println(location.getName() + " (woeid:" + location.getWoeid() + ")");
      }
      System.out.println("done.");
      System.exit(0);
    } catch (TwitterException te) {
      te.printStackTrace();
      System.out.println("Failed to get trends: " + te.getMessage());
      System.exit(-1);
    }
  }
}
