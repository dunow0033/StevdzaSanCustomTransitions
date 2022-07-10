package com.express.android.navigationcustomtransitions.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.express.android.navigationcustomtransitions.R
import com.express.android.navigationcustomtransitions.databinding.FragmentFirstBinding
import com.express.android.navigationcustomtransitions.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var _binding: FragmentSecondBinding
    private val binding: FragmentSecondBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.navBackFromSecondBtn.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_homeFragment)
        }
    }
}
