package com.example.affirmation_app_kotlin_compose.data

import com.example.affirmation_app_kotlin_compose.R

class AffirmationList() {
    fun getData(): List<AffirmationData>{

            return listOf<AffirmationData>(
                AffirmationData(R.string.affirmation1, R.drawable.image1),
                AffirmationData(R.string.affirmation2, R.drawable.image2),
                AffirmationData(R.string.affirmation3, R.drawable.image3),
                AffirmationData(R.string.affirmation4, R.drawable.image4),
                AffirmationData(R.string.affirmation5, R.drawable.image5),
                AffirmationData(R.string.affirmation6, R.drawable.image6),
                AffirmationData(R.string.affirmation7, R.drawable.image7),
                AffirmationData(R.string.affirmation8, R.drawable.image8),
                AffirmationData(R.string.affirmation9, R.drawable.image9),
                AffirmationData(R.string.affirmation10, R.drawable.image10))

    }

    companion object {
        fun getData(): List<AffirmationData> {
            return listOf<AffirmationData>(
                AffirmationData(R.string.affirmation1, R.drawable.image1),
                AffirmationData(R.string.affirmation2, R.drawable.image2),
                AffirmationData(R.string.affirmation3, R.drawable.image3),
                AffirmationData(R.string.affirmation4, R.drawable.image4),
                AffirmationData(R.string.affirmation5, R.drawable.image5),
                AffirmationData(R.string.affirmation6, R.drawable.image6),
                AffirmationData(R.string.affirmation7, R.drawable.image7),
                AffirmationData(R.string.affirmation8, R.drawable.image8),
                AffirmationData(R.string.affirmation9, R.drawable.image9),
                AffirmationData(R.string.affirmation10, R.drawable.image10))
        }
    }
}