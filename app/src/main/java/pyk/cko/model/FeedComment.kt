package pyk.cko.model

import android.os.Parcelable

data class FeedComment(
        override val id: Long,
        override val type: Int,
        override val groupConvert: Int,
        val comment: String?
) : FeedItem {}