package ie.wit.assignment1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ie.wit.assignment1.MainApp
import ie.wit.assignment1.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var app : MainApp
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = root.findViewById(R.id.recycler_view)
        activity?.let{
            app = it.application as MainApp
            recyclerView.adapter = OutfitAdapter(app.list)
        }
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val adapter = recyclerView.adapter
        adapter?.notifyDataSetChanged()
        return root
    }

    override fun onResume() {
        recyclerView.adapter?.notifyDataSetChanged()
        super.onStart()
    }
}