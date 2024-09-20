package com.projects.navigationcomponentbasics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.projects.navigationcomponentbasics.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    //safe args creates SecondFragmentArgs class in java(generated) folder
    val args: SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        val num = args.number
        binding.textview1.text = num.toString()
        binding.textview1.setOnClickListener{

            Navigation.findNavController(binding.root).navigate(R.id.action_secondFragment_to_firstFragment)
        }

        return binding.root
    }

}