package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.test.databinding.ActivityMainBinding
import com.example.test.databinding.FragmentBlankBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class BlankFragment : Fragment() {


    lateinit var binding: FragmentBlankBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentBlankBinding.inflate(inflater,container,false)



        findNavController().navigate(R.id.action_blankFragment_to_blankFragment2)



        return binding.root



    }


}