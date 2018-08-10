package com.rest.api.twitter.tweets;


import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

import java.util.List;

public class GetReTweets {

  private static final String TWITTER_CONSUMER_KEY = "HKY9C6MoHzqF2NE0vcgKm0f2c";
  private static final String TWITTER_SECRET_KEY = "nfCBrun4z2E7igv6I5DeulVJKbSj8VuQmf9gHcD9pSlQAL1F4Q";
  private static final String TWITTER_ACCESS_TOKEN = "175862794-iuSOT0Z7oIpUzemsmnAOsWXbAFXapIRqTjkwXUzr";
  private static final String TWITTER_ACCESS_TOKEN_SECRET = "dJGDj0w1aT34UvLNFfTF2X2n1sHgIg3bQISs6wPmJYKMZ";


  public static void main(String[] args) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(TWITTER_ACCESS_TOKEN, TWITTER_ACCESS_TOKEN_SECRET);
    twitter.setOAuthConsumer(TWITTER_CONSUMER_KEY, TWITTER_SECRET_KEY);
    twitter.setOAuthAccessToken(accessToken);

    String statusId = "1027494767989538816";

    System.out.println("Showing up to 100 of the first retweets of the status id - [" + statusId + "].");
    try {
      List<Status> statuses = twitter.getRetweets(Long.parseLong(statusId));
      for (Status status : statuses) {
        System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
      }
      System.out.println("done.");
      System.exit(0);
    } catch (TwitterException te) {
      te.printStackTrace();
      System.out.println("Failed to get retweets: " + te.getMessage());
      System.exit(-1);
    }
  }
}
