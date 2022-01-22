package com.example.android.ui.main.adapter

import com.example.android.databinding.SmallFilmItemBinding
import com.example.android.ui.main.models.Film

class FilmViewHolder(
    private val binding: SmallFilmItemBinding
) : AbstractAdapter.ViewHolder<Film>(binding) {

    override fun bind(data: Film, onClick: (Film) -> Unit) {
        binding.title.text = data.title
        binding.episode.text = data.episodeId.toString()
        binding.root.setOnClickListener {
            onClick(data)
        }
    }
}