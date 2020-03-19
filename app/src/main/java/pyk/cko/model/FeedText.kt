package pyk.cko.model

data class FeedText(
    override val id: Long,
    override val type: String,
    val text: String
) : FeedItem {}