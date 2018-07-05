package com.alfredtechsystems.minglemingle.votes.view;

import java.util.List;

import renaro.tinderlikesample.UserProfile;

/**
 * Created by alfred on 05/07/18.
 */
public interface VotingActivityView {

    void showLoading();

    void hideLoading();

    void showProfiles(List<UserProfile> profiles);

    void showNegativeVote();

    void showPositiveVote();

    void showMatch(UserProfile profile);

    int cardsLeft();

    void showOutOfVotes();
}
