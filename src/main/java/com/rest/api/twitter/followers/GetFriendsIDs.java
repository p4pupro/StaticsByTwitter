package com.rest.api.twitter.followers;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.IDs;
import twitter4j.TwitterException;

public class GetFriendsIDs {

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
            long cursor = -1;
            IDs ids;
            System.out.println("Listing following ids.");
            do {
              if (0 < args.length) {
                ids = twitter.getFriendsIDs(args[0], cursor);
              } else {
                ids = twitter.getFriendsIDs(cursor);
              }
              for (long id : ids.getIDs()) {
                System.out.println(id);
              }
            } while ((cursor = ids.getNextCursor()) != 0);
            System.exit(0);
          } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get friends' ids: " + te.getMessage());
            System.exit(-1);
          }
        }
}
