package pyk.cko.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pyk.cko.R
import pyk.cko.constants.StaticValues
import pyk.cko.model.FeedItem
import pyk.cko.model.FeedText

class HomeFeedAdapter : RecyclerView.Adapter<HomeFeedAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate: View =
            LayoutInflater.from(parent.context).inflate(R.layout.feeditem_text, parent, false)

        return ViewHolder(inflate)
    }

    override fun getItemCount(): Int {
        return StaticValues.items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.update(StaticValues.items[position])
    }

    class ViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val text: TextView = itemView.findViewById(R.id.tv_text)
        fun update(item: FeedItem) {
            if(item is FeedText) {
                text.text = (item as FeedText).text
            }
        }
    }
}