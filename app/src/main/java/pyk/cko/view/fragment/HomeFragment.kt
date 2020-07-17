package pyk.cko.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.feeditem_text_club.view.*
import org.intellij.lang.annotations.JdkConstants
import pyk.cko.App
import pyk.cko.R
import pyk.cko.view.adapter.HomeFeedAdapter

class HomeFragment : Fragment() {
    private lateinit var rootView: View
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_home, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = rootView.findViewById(R.id.rv_feed)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = HomeFeedAdapter()
        val dividerDecoration = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        getDrawable(requireContext(), R.drawable.divider)?.let { dividerDecoration.setDrawable(it) }
        recyclerView.addItemDecoration(dividerDecoration)
    }
}