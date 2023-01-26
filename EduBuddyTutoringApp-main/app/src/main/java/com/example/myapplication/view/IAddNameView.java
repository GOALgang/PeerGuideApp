/*
   Pranav Alaparthi, Pavan Vemparala
   January 24, 2023

   User input for first and last name.
*/

package com.example.myapplication.view;
/**
 * An interface asking for user's input: first name and last name
 *
 */

public interface IAddNameView {

    interface Listener {
        /**
         * This method add user to the user library
         * @param fullName
         */
        void onAddedUser(String fullName);
    }

}
