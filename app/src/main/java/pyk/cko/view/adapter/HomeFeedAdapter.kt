package pyk.cko.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.NavAction
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import pyk.cko.R
import pyk.cko.constants.StaticValues
import pyk.cko.model.FeedItem
import pyk.cko.model.FeedText

class HomeFeedAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            StaticValues.TYPE_TEXT       -> {
                TextViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feeditem_text, parent, false)
                )
            }
            StaticValues.TYPE_TEXT_CLUB  -> {
                TextViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feeditem_text_club, parent, false)
                )
            }
            StaticValues.TYPE_PHOTO      -> {
                PhotoViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feeditem_photo, parent, false)
                )
            }
            StaticValues.TYPE_PHOTO_CLUB -> {
                PhotoViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feeditem_photo_club, parent, false)
                )
            }
            StaticValues.TYPE_VIDEO      -> {
                VideoViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feeditem_video, parent, false)
                )
            }
            StaticValues.TYPE_VIDEO_CLUB -> {
                VideoViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.feeditem_video_club, parent, false)
                )
            }
            else                         -> {
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
        return StaticValues.items[position].type + StaticValues.items[position].groupConvert
    }

    class TextViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val text: TextView = itemView.findViewById(R.id.tv_text)
        fun update(item: FeedItem) {
            if (item is FeedText) {
                text.text = item.text
            }
            val bundle = bundleOf("item" to item)
            itemView.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_itemDetailsFragment, bundle))
        }
    }

    class PhotoViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val text: TextView = itemView.findViewById(R.id.tv_text)
        fun update(item: FeedItem) {
            if (item is FeedText) {
                text.text = item.text
            }
            if(text.text.isEmpty()) {
                text.visibility = View.GONE
            }
            val bundle = bundleOf("item" to item)
            itemView.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_itemDetailsFragment, bundle))
        }
    }

    class VideoViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val text: TextView = itemView.findViewById(R.id.tv_text)
        fun update(item: FeedItem) {
            if (item is FeedText) {
                text.text = item.text
            }
            if(text.text.isEmpty()) {
                text.visibility = View.GONE
            }
            val bundle = bundleOf("item" to item)
            itemView.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_itemDetailsFragment, bundle))
        }
    }
}