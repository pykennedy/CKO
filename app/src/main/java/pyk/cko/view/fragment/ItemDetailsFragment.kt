package pyk.cko.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pyk.cko.R
import pyk.cko.model.FeedText
import pyk.cko.view.adapter.HomeFeedAdapter
import pyk.cko.view.adapter.ItemDetailsAdapter

class ItemDetailsFragment: Fragment() {
    private lateinit var rootView: View
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_itemdetails_motion, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = arguments
        val item = bundle?.get("item") as FeedText
        val textView: TextView = rootView.findViewById(R.id.tv_text)
        textView.text = item.text

        recyclerView = rootView.findViewById(R.id.rv_comments)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = ItemDetailsAdapter()
    }
}