package dev.androidblog.blueprint.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dev.androidblog.blueprint.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment: Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_first.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }

        tv_title.text = "Second Fragment\nID : ${arguments?.getString("id")}"
    }
}