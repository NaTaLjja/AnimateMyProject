package com.example.myproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class FirstFragment: Fragment() {
    var bundle = Bundle()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(R.layout.first_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val image: ImageView = view.findViewById(R.id.photo)
        val buttonEmail:Button = view.findViewById(R.id.email)
        val buttonPhone:Button = view.findViewById(R.id.phone)

        buttonEmail.setOnClickListener {
            bundle.putString(KEY_VALUE,"Email\ndobrodjelo@gmail.com")
            parentFragmentManager.beginTransaction()
                .addSharedElement(image, "my_shared_transition")
                .addToBackStack("secondfragment")
                .replace(R.id.container, SecondFragment::class.java, bundle)
                .commit()
        }

        buttonPhone.setOnClickListener {
            bundle.putString(KEY_VALUE,"Phone\n+38267 999 000")
            parentFragmentManager.beginTransaction()
                .addSharedElement(image, "my_shared_transition")
                .addToBackStack("secondfragment")
                .replace(R.id.container, SecondFragment::class.java, bundle)
                .commit()
        }
    }

    companion object{
        const val KEY_VALUE = "key_value"
    }
}