package com.alfredtechsystems.minglemingle.profile.dao;


import com.alfredtechsystems.minglemingle.UserProfile;

import java.util.List;

/**
 * Created by alfred on 21/05/18.
 */
public abstract class ProfileDAO {

    public abstract List<UserProfile> fetchProfiles();

    public abstract int fetchRemainingVotes();

    public abstract boolean voteProfile(final UserProfile profile, final boolean vote);
}
