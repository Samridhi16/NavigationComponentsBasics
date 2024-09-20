package com.projects.navigationcomponentbasics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.projects.navigationcomponentbasics.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater,container,false)
//        val view = inflater.inflate(R.layout.fragment_first, container, false)

        binding.textview1.setOnClickListener{
            Navigation.findNavController(binding.root).navigate(R.id.action_secondFragment_to_firstFragment)
        }

        return binding.root
    }

}