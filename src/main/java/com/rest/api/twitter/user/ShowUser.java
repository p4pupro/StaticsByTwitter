package com.rest.api.twitter.user;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;


public final class ShowUser {

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
    try {

      User user = twitter.showUser(usuario);
      if (user.getStatus() != null) {
        System.out.println("@" + user.getScreenName());
        System.out.println("Name: " + user.getName());
        System.out.println("ID: " + user.getId());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Photo: " + user.getBiggerProfileImageURL());
        System.out.println("Total Tweets: " + user.getStatusesCount());
        System.out.println("Date in: " + user.getCreatedAt());
        System.out.println("Description: " + user.getDescription());
        System.out.println("Total List: " + user.getListedCount());
        System.out.println("Idiom: " + user.getLang());
        System.out.println("Location: " + user.getLocation());
        System.out.println("Time Zone: " + user.getTimeZone());
        System.out.println("Is Verified User: " + user.isVerified());
        System.out.println("Total Followers: " + user.getFollowersCount());
        System.out.println("Total Friends: " + user.getFriendsCount());
        System.out.println("Total Favorites: " + user.getFavouritesCount());
        System.out.println("IsGeoEnable: " + user.isGeoEnabled());




      } else {
        // the user is protected
        System.out.println("@" + user.getScreenName());
      }
      System.exit(0);
    } catch (TwitterException te) {
      te.printStackTrace();
      System.out.println("Failed to delete status: " + te.getMessage());
      System.exit(-1);
    }
  }
}