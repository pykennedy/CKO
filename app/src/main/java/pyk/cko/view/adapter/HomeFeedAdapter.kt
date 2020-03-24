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

class HomeFeedAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            StaticValues.TYPE_TEXT  -> {
                TextViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feeditem_text, parent, false)
                )
            }
            StaticValues.TYPE_PHOTO -> {
                PhotoViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feeditem_photo, parent, false)
                )
            }
            StaticValues.TYPE_VIDEO -> {
                VideoViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feeditem_video, parent, false)
                )
            }
            else                    -> {
                TextViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feeditem_text, parent, false)
                )
            }
        }

    }

    override fun getItemCount(): Int {
        return StaticValues.items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (StaticValues.items[position].type) {
            StaticValues.TYPE_TEXT  -> (holder as TextViewHolder).update(
                StaticValues.items[position]
            )
            StaticValues.TYPE_PHOTO -> (holder as PhotoViewHolder).update(
                StaticValues.items[position]
            )
            StaticValues.TYPE_VIDEO -> (holder as VideoViewHolder).update(
                StaticValues.items[position]
            )
        }

    }

    override fun getItemViewType(position: Int): Int {
        return StaticValues.items[position].type
    }

    class TextViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val text: TextView = itemView.findViewById(R.id.tv_text)
        fun update(item: FeedItem) {
            if (item is FeedText) {
                text.text = (item as FeedText).text
            }
        }
    }

    class PhotoViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val text: TextView = itemView.findViewById(R.id.tv_text)
        fun update(item: FeedItem) {
            if (item is FeedText) {
                text.text = (item as FeedText).text
            }
        }
    }

    class VideoViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val text: TextView = itemView.findViewById(R.id.tv_text)
        fun update(item: FeedItem) {
            if (item is FeedText) {
                text.text = (item as FeedText).text
            }
        }
    }
}