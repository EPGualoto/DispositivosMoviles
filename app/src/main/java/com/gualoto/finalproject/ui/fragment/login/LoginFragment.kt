package com.gualoto.finalproject.ui.fragment.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gualoto.finalproject.R
import com.gualoto.finalproject.databinding.FragmentLoginBinding
import com.gualoto.finalproject.databinding.FragmentRecoveryBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            FragmentLoginBinding.bind(
                inflater.inflate(
                    R.layout.fragment_login,
                    container, false
                )
            )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        binding.btnSigIn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        binding.btnRecovery.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_recoveryFragment)
        }

    }

}