package com.repkuc.composition.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.repkuc.composition.R
import com.repkuc.composition.databinding.FragmentGameFinishBinding
import java.lang.RuntimeException


class GameFinishFragment : Fragment() {

    private var _binding: FragmentGameFinishBinding? = null
    private val binding: FragmentGameFinishBinding
    get() = _binding ?: throw RuntimeException("FragmentGameFinishBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGameFinishBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}