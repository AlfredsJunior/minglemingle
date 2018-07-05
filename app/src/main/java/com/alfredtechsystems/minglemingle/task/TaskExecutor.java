package com.alfredtechsystems.minglemingle.task;

import android.support.annotation.NonNull;

/**
 * Created by alfred on 20/01/18.
 */
public interface TaskExecutor {

    <T> void async(@NonNull final AppTask<T> task);
}
