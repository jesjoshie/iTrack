package com.example.itrack.bottomNavfragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ViewFlipper
import com.example.itrack.R
import android.net.Uri
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class communityFragment : Fragment(R.layout.fragment_community) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
          view.findViewById<ImageButton>(R.id.blogs).setOnClickListener{val intent  = Intent(Intent.ACTION_VIEW, Uri.parse("https://nuawoman.com/blog/6-tips-for-good-menstrual-hygiene/"))

              getActivity()?.startActivity(intent)}

           /*val blog = Intent(Intent.ACTION_VIEW, Uri.parse("https://nuawoman.com/blog/6-tips-for-good-menstrual-hygiene/"))
            startActivity(blog)*/
        }
    }

/*
val intent = Intent (getActivity(), Main::class.java)
getActivity().startActivity(intent)
*/
