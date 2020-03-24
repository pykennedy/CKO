package pyk.cko.constants

import pyk.cko.model.FeedItem
import pyk.cko.model.FeedText

class StaticValues {
    companion object {
        const val TYPE_TEXT: Int = 0
        const val TYPE_PHOTO: Int = 1
        const val TYPE_VIDEO: Int = 2

        val items: MutableList<FeedItem> = initItems()

        private fun initItems(): MutableList<FeedItem> {
            val list: MutableList<FeedItem> = mutableListOf()
            list.add(FeedText(0, 0, "OMG I JUST HAD SO MUCH FUN AT THE BEACH LOL XDDDD"))
            list.add(
                FeedText(
                    1, 0,
                    "LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN"
                )
            )
            list.add(
                FeedText(
                    2, 0,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. Such a feeling can only be described in metaphysical properties including but not exclusive to feeling like Anakin Skywalker when  he discusses his distaste for sand."
                )
            )
            list.add(FeedText(3, 0, "777"))
            list.add(
                FeedText(
                    2, 0,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. "
                )
            )

            list.add(FeedText(0, 1, "OMG I JUST HAD SO MUCH FUN AT THE BEACH LOL XDDDD"))
            list.add(
                FeedText(
                    1, 1,
                    "LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN"
                )
            )
            list.add(
                FeedText(
                    2, 1,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. Such a feeling can only be described in metaphysical properties including but not exclusive to feeling like Anakin Skywalker when  he discusses his distaste for sand."
                )
            )
            list.add(FeedText(3, 1, "777"))
            list.add(
                FeedText(
                    2, 1,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. "
                )
            )

            list.add(FeedText(0, 2, "OMG I JUST HAD SO MUCH FUN AT THE BEACH LOL XDDDD"))
            list.add(
                FeedText(
                    1, 2,
                    "LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN"
                )
            )
            list.add(
                FeedText(
                    2, 2,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. Such a feeling can only be described in metaphysical properties including but not exclusive to feeling like Anakin Skywalker when  he discusses his distaste for sand."
                )
            )
            list.add(FeedText(3, 2, "777"))
            list.add(
                FeedText(
                    2, 2,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. "
                )
            )

            return list
        }
    }
}