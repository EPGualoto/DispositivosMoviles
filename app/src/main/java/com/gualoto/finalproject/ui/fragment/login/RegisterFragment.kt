package com.gualoto.finalproject.ui.fragment.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gualoto.finalproject.R
import com.gualoto.finalproject.databinding.FragmentRecoveryBinding
import com.gualoto.finalproject.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            FragmentRegisterBinding.bind(
                inflater.inflate(
                    R.layout.fragment_register,
                    container, false
                )
            )
        return binding.root
    }

}
