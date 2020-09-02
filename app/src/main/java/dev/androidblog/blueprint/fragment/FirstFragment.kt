package dev.androidblog.blueprint.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dev.androidblog.blueprint.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_second.setOnClickListener {

            //Safe Arg를 이용한 Fragment 이동방법
            //https://developer.android.com/guide/navigation/navigation-navigate?hl=ko#safeargs

            //Action ID를 이용한 Fragment 이동
            //가급적 Action ID를 통한 이동을 추천한다.
            /**
             * When navigating using IDs, we strongly recommend using actions where possible.
             * Actions provide additional information in your navigation graph,
             * visually showing how your destinations connect to each other.
             * By creating actions, you can replace resource IDs with Safe Args-generated operations, providing additional compile-time safety.
             * By using an action, you can also animate transitions between the destinations.
             * For more information, see Animate transitions between destinations.
             */
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }
}