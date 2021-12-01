package com.example.ca_1;

import java.util.*;

class SampleDataProvider {

    // Companion objects are is like creating static values in Java
    companion object

    {

        private val sampleName1 = "Game Of Thrones"
        private val sampleName2 = "Breaking Bad"
        private val sampleName3 = "Tom & Jerry"
        private val sampleName4 = "The Sopranos"

        private val sampleDesc1 = "2 Slips cut from main Monstera, rooted in water for 4 weeks"
        private val sampleDesc2 = "Propagation from leaves"
        private val sampleDesc3 = "2 Slips cut from main Monstera, rooted in water for 4 weeks"
        private val sampleDesc4 = "Propagation from leaves"
    }

        fun getTvShow () = arrayListOf(
            TvShowEntity(sampleName1, sampleDesc1),
            TvShowEntity(sampleName2, sampleDesc2),
            TvShowEntity(sampleName3, sampleDesc3),
            TvShowEntity(sampleName4, sampleDesc4)

    );

    }
}