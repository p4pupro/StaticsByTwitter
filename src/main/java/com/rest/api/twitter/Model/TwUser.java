package com.rest.api.twitter.Model;


import javax.persistence.*;
import java.util.Objects;


@Entity
  public class TwUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String screenName;

    @Column(nullable = false)
    private String twName;

    @Column(nullable = false, unique = true)
    private String twUserId;

    @Column(nullable = true, unique = true)
    private String twEmail;

    @Column(nullable = true)
    private String twBigProfileImageURL;

    @Column(nullable = false)
    private String twDateIn;

    @Column(nullable = true)
    private String twDescription;

    @Column(nullable = false)
    private boolean twIsVerified;

    @Column(nullable = true)
    private String twLang;

    @Column(nullable = true)
    private String twLocation;

    @Column(nullable = true)
    private String twTimeZone;

    @Column(nullable = true)
    private boolean twIsGeoEnable;

    @Column(nullable = false)
    private int twTotalFollowers;

    @Column(nullable = false)
    private int twTotalFriends;

    @Column(nullable = false)
    private int twTotalFavorites;

    @Column(nullable = false)
    private int twTotalList;


    public long getId() {
      return id;
    }

    public void setId(long id) {
      this.id = id;
    }

    public String getScreenName() {
      return screenName;
    }

    public void setScreenName(String screenName) {
      this.screenName = screenName;
    }

    public String getTwName() {
      return twName;
    }

    public void setTwName(String twName) {
      this.twName = twName;
    }

    public String getTwUserId() {
      return twUserId;
    }

    public void setTwUserId(String twUserId) {
      this.twUserId = twUserId;
    }

    public String getTwEmail() {
      return twEmail;
    }

    public void setTwEmail(String twEmail) {
      this.twEmail = twEmail;
    }

    public String getTwBigProfileImageURL() {
      return twBigProfileImageURL;
    }

    public void setTwBigProfileImageURL(String twBigProfileImageURL) {
      this.twBigProfileImageURL = twBigProfileImageURL;
    }

    public String getTwDateIn() {
      return twDateIn;
    }

    public void setTwDateIn(String twDateIn) {
      this.twDateIn = twDateIn;
    }

    public String getTwDescription() {
      return twDescription;
    }

    public void setTwDescription(String twDescription) {
      this.twDescription = twDescription;
    }

    public boolean isTwIsVerified() {
      return twIsVerified;
    }

    public void setTwIsVerified(boolean twIsVerified) {
      this.twIsVerified = twIsVerified;
    }

    public String getTwLang() {
      return twLang;
    }

    public void setTwLang(String twLang) {
      this.twLang = twLang;
    }

    public String getTwLocation() {
      return twLocation;
    }

    public void setTwLocation(String twLocation) {
      this.twLocation = twLocation;
    }

    public String getTwTimeZone() {
      return twTimeZone;
    }

    public void setTwTimeZone(String twTimeZone) {
      this.twTimeZone = twTimeZone;
    }

    public boolean isTwIsGeoEnable() {
      return twIsGeoEnable;
    }

    public void setTwIsGeoEnable(boolean twIsGeoEnable) {
      this.twIsGeoEnable = twIsGeoEnable;
    }

    public int getTwTotalFollowers() {
      return twTotalFollowers;
    }

    public void setTwTotalFollowers(int twTotalFollowers) {
      this.twTotalFollowers = twTotalFollowers;
    }

    public int getTwTotalFriends() {
      return twTotalFriends;
    }

    public void setTwTotalFriends(int twTotalFriends) {
      this.twTotalFriends = twTotalFriends;
    }

    public int getTwTotalFavorites() {
      return twTotalFavorites;
    }

    public void setTwTotalFavorites(int twTotalFavorites) {
      this.twTotalFavorites = twTotalFavorites;
    }

    public int getTwTotalList() {
      return twTotalList;
    }

    public void setTwTotalList(int twTotalList) {
      this.twTotalList = twTotalList;
    }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TwUser twUser = (TwUser) o;
    return id == twUser.id &&
            twIsVerified == twUser.twIsVerified &&
            twIsGeoEnable == twUser.twIsGeoEnable &&
            twTotalFollowers == twUser.twTotalFollowers &&
            twTotalFriends == twUser.twTotalFriends &&
            twTotalFavorites == twUser.twTotalFavorites &&
            twTotalList == twUser.twTotalList &&
            Objects.equals(screenName, twUser.screenName) &&
            Objects.equals(twName, twUser.twName) &&
            Objects.equals(twUserId, twUser.twUserId) &&
            Objects.equals(twEmail, twUser.twEmail) &&
            Objects.equals(twBigProfileImageURL, twUser.twBigProfileImageURL) &&
            Objects.equals(twDateIn, twUser.twDateIn) &&
            Objects.equals(twDescription, twUser.twDescription) &&
            Objects.equals(twLang, twUser.twLang) &&
            Objects.equals(twLocation, twUser.twLocation) &&
            Objects.equals(twTimeZone, twUser.twTimeZone);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, screenName, twName, twUserId, twEmail, twBigProfileImageURL, twDateIn, twDescription, twIsVerified, twLang, twLocation, twTimeZone, twIsGeoEnable, twTotalFollowers, twTotalFriends, twTotalFavorites, twTotalList);
  }

  @Override
    public String toString() {
      return "TwUser{" +
              "id=" + id +
              ", screenName='" + screenName + '\'' +
              ", twName='" + twName + '\'' +
              ", twUserId='" + twUserId + '\'' +
              ", twEmail='" + twEmail + '\'' +
              ", twBigProfileImageURL='" + twBigProfileImageURL + '\'' +
              ", twDateIn='" + twDateIn + '\'' +
              ", twDescription='" + twDescription + '\'' +
              ", twIsVerified=" + twIsVerified +
              ", twLang='" + twLang + '\'' +
              ", twLocation='" + twLocation + '\'' +
              ", twTimeZone='" + twTimeZone + '\'' +
              ", twIsGeoEnable=" + twIsGeoEnable +
              ", twTotalFollowers=" + twTotalFollowers +
              ", twTotalFriends=" + twTotalFriends +
              ", twTotalFavorites=" + twTotalFavorites +
              ", twTotalList=" + twTotalList +
              '}';
    }
  }

