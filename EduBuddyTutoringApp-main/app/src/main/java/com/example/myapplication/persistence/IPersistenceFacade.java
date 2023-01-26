/*
   Pranav Alaparthi, Pavan Vemparala
   January 24, 2023

   Interface that code interested in receiving
   ledger data must implement.
*/

package com.example.myapplication.persistence;

import androidx.annotation.NonNull;

import com.example.myapplication.model.TutorUser;
import com.example.myapplication.model.UserLibrary;
import com.example.myapplication.model.User;

public interface IPersistenceFacade {

    interface DataListener<T>{
        void onDataReceived(@NonNull T data);
        void onNoDataFound();
    }

    interface BinaryResultListener {
        void onYesResult();
        void onNoResult();
    }

    // user library related
    void saveUser(@NonNull User user);
    void saveTutorUser(@NonNull TutorUser tutorUser);
    void retrieveUserLibrary(@NonNull DataListener<UserLibrary> listener);

    // authentication related
    void createUserIfNotExists(@NonNull User user, @NonNull BinaryResultListener listener);
    void retrieveUser(@NonNull String username, @NonNull DataListener<User> listener);
}