package com.alfredtechsystems.minglemingle;

import java.util.ArrayList;

/**
 * Created by alfred on 2/20/17.
 */

public interface FirebaseMethodsInterface {
    public void getUsersFBInfoCompleted(Facebook_Info fbInfo);

    public void checkIfUsersAreMatched(boolean alreadyMatched);


    public void fetchChatsMetaCompleted(ArrayList<ChatsMeta> chatsMeta);

    public void getBlockListCompleted(ArrayList<String> blockedUsers);

    public void getChatStatusCompleted(boolean active);

}
