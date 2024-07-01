package com.gualoto.finalproject.ui.fragment.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gualoto.finalproject.R
import com.gualoto.finalproject.databinding.FragmentRecoveryBinding

class RecoveryFragment : Fragment() {

    private lateinit var binding: FragmentRecoveryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecoveryBinding.bind(
            inflater.inflate(
            R.layout.fragment_recovery,
                container, false
            )
        )
        return binding.root
    }

}