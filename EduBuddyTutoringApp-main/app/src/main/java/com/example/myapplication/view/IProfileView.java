/*
   Pranav Alaparthi, Pavan Vemparala
   January 24, 2023

   Method enabling students to send
   a tutoring request is called here.
*/

package com.example.myapplication.view;

public interface IProfileView {

    interface Listener {
        /**
         * This method allow user to send tutoring request to another account
         */
        void onSendRequest();
    }

}
