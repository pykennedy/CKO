package pyk.cko.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FeedText(
    override val id: Long,
    override val type: Int,
    override val groupConvert: Int,
    val text: String?
) : FeedItem, Parcelable {}