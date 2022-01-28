package com.sv.stack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.sv.stack.databinding.FragmentDialogOneBinding
import com.sv.stack.databinding.FragmentHomeBinding

class dialog_one : BottomSheetDialogFragment() {

    private var _binding: FragmentDialogOneBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentDialogOneBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.cardone.setOnClickListener {
            findNavController().navigate(R.id.action_dialog_one_to_dialog_two)
        }
    }


}