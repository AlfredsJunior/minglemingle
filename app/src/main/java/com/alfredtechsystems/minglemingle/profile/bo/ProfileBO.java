package com.alfredtechsystems.minglemingle.profile.bo;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;

import com.alfredtechsystems.minglemingle.UserProfile;
import com.alfredtechsystems.minglemingle.profile.dao.ProfileDAO;
import com.alfredtechsystems.minglemingle.votes.model.VoteResponse;

import java.util.List;


/**
 * Created by alfred on 21/02/18.
 */
public class ProfileBO {

    private final ProfileDAO mDao;

    public ProfileBO(@NonNull final ProfileDAO dao) {
        mDao = dao;
    }

    public List<UserProfile> fetchProfiles() {
        return mDao.fetchProfiles();
    }

    @WorkerThread
    public VoteResponse profileVoted(final UserProfile profile, final boolean vote) {
        final int remainingVotes = mDao.fetchRemainingVotes();
        if (remainingVotes == 0){
            return new VoteResponse(false, true);
        } else {
            final boolean isAMatch = mDao.voteProfile(profile, vote);
            return new VoteResponse(isAMatch, false);
        }

    }
}
