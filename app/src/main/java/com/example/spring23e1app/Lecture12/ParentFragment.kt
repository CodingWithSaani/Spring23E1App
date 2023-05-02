package com.example.spring23e1app.Lecture12

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.spring23e1app.R


class ParentFragment : Fragment() {

    private lateinit var communicator: Communicator
    private lateinit var communicateBtn:Button

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is Communicator)
        {
            communicator = context
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_parent, container, false)
        communicateBtn = root.findViewById(R.id.lec12_frag_parent_click_btn)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        communicateBtn.setOnClickListener {
            communicator.communicateData("Data from parent")
        }
    }


}