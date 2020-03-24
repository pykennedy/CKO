package pyk.cko.model

data class FeedText(
    override val id: Long,
    override val type: Int,
    val text: String
) : FeedItem {}