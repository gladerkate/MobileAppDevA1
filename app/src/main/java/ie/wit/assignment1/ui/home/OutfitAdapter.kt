package ie.wit.assignment1.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import ie.wit.assignment1.OutfitModel
import ie.wit.assignment1.R

class OutfitAdapter(private val list : List<OutfitModel>) : RecyclerView.Adapter<OutfitAdapter.ViewHolder>() {
    class ViewHolder(private val cardView : CardView) : RecyclerView.ViewHolder(cardView){
        fun bind(outfit: OutfitModel){
            val title= cardView.findViewById<TextView>(R.id.list_item_title)
            val desc = cardView.findViewById<TextView>(R.id.list_item_desc)
            val image = cardView.findViewById<ImageView>(R.id.list_item_image)
            title.text = outfit.name
            desc.text = outfit.description
            image.setImageResource(R.drawable.ic_launcher_foreground)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : CardView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_outfit, parent,false) as CardView
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }
}