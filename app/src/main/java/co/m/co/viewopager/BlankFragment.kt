package co.m.co.viewopager

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            if (it.containsKey("color")) {
                view.setBackgroundColor(it.getInt("color"))
            }
        }

    }


    companion object {

        @JvmStatic
        fun newInstance(color: Int) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putInt("color", color)
                }
            }
    }
}
