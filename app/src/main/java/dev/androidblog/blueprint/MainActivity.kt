package dev.androidblog.blueprint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Activity에서 첫번째 fragment로 arg 전달
        val navController = findNavController(R.id.nav_host_fragment)
        navController.setGraph(navController.graph, bundleOf("prefix" to 5555))

        // Activity에서 기타 fragment로 arg 전달 및 이동
//        navController.navigate(R.id.action_firstFragment_to_secondFragment, bundleOf("id" to "3fwef423"))
    }
}
