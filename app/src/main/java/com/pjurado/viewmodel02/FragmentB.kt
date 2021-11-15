package com.pjurado.viewmodel02

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pjurado.viewmodel02.databinding.FragmentABinding
import com.pjurado.viewmodel02.databinding.FragmentBBinding


class FragmentB : Fragment() {
    private lateinit var binding: FragmentBBinding
    private lateinit var viewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        binding.buttonOk.setOnClickListener {
            viewModel.nombre.value = binding.editText.text.toString()
        }

        viewModel.nombre.observe(viewLifecycleOwner, Observer {
            binding.editText.setText(it)
        })
    }

}