package com.example.spring23e1app.Lecture12

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.spring23e1app.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ChildFragment : Fragment() {


    private lateinit var resultTV:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val childFragmentRoot = inflater.inflate(R.layout.fragment_child, container, false)
        resultTV = childFragmentRoot.findViewById(R.id.lec12_child_frag_result_tv)

        return childFragmentRoot
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        resultTV.text = arguments?.getString("key")?:"No value received"
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String) =
            ChildFragment().apply {
                arguments = Bundle().apply {
                    putString("key", param1)
                }
            }
    }
}