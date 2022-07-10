package com.express.android.navigationcustomtransitions.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.express.android.navigationcustomtransitions.R
import com.express.android.navigationcustomtransitions.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var _binding: FragmentHomeBinding
    private val binding: FragmentHomeBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
         return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.navToFirstBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_firstFragment)
        }

        binding.navToSecondBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }
    }

}