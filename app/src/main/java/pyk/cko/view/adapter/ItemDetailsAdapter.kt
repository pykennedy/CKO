package pyk.cko.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pyk.cko.R
import pyk.cko.constants.StaticValues
import pyk.cko.model.FeedComment
import pyk.cko.model.FeedItem

class ItemDetailsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CommentViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.commentitem, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return StaticValues.comments.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as CommentViewHolder).update(StaticValues.comments[position])
    }

    class CommentViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(
        itemView
    ) {
        private val text: TextView = itemView.findViewById(R.id.tv_text)
        fun update(item: FeedItem) {
            if (item is FeedComment) {
                text.text = item.comment
            }
        }
    }
}