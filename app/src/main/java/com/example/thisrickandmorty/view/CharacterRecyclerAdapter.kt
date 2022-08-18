package com.example.thisrickandmorty.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.thisrickandmorty.R
import com.example.thisrickandmorty.model.Character
import com.example.thisrickandmorty.util.gorselIndir
import com.example.thisrickandmorty.util.placeholderYap
import kotlinx.android.synthetic.main.character_recycler_row.view.*
import kotlinx.android.synthetic.main.fragment_character_detail.*


class CharacterRecyclerAdapter(val characterList : ArrayList<Character>) :
    RecyclerView.Adapter<CharacterRecyclerAdapter.CharacterViewHolder>() {
    class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.character_recycler_row,parent,false)
        return CharacterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return characterList.size
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {

        holder.itemView.name.text = characterList[position].name
        holder.itemView.status.text = characterList[position].status
        holder.itemView.species.text = characterList[position].species
        holder.itemView.gender.text = characterList[position].gender

        /**
         * @see: https://i0.wp.com/dikkatspoiler.com/wp-content/uploads/2017/06/social-1.jpg?resize=1024%2C576&ssl=1
         */

        holder.itemView.setOnClickListener{
            val action = CharacterListFragmentDirections.actionCharacterListFragmentToCharacterDetailFragment(0)
            Navigation.findNavController(it).navigate(action)

        }

        holder.itemView.image.gorselIndir(characterList.get(position).image, placeholderYap(holder.itemView.context))



    }

    fun characterListGüncelle(newCharacterList: List<Character>){
        characterList.clear()
        characterList.addAll(newCharacterList)
        notifyDataSetChanged()
    }

}