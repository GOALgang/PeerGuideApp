/*
   Pranav Alaparthi, Pavan Vemparala
   January 24, 2023

   View of the tutor account.
*/

package com.example.myapplication.view;
/**
 * An interface displaying tutor's individual profile
 *
 */
public interface IAccountView {

    interface Listener {
        /**
         * This method allow user to edit account
         */
        void onEditAccount();
    }

}
