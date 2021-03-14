package com.example.itrack.bottomNavfragments

import android.os.Bundle
import android.transition.Slide
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.ImageView
import android.widget.SearchView
import android.widget.ViewFlipper
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.itrack.R
import com.example.itrack.adapters.ListOfGraphSelection
import com.example.itrack.adapters.graphGridView


class communityFragment : Fragment(R.layout.fragment_community) {
 lateinit var  imageslider:ImageSlider

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)

        imageslider = view.findViewById(R.id.image_slider)

                    var imageList = ArrayList<SlideModel>()
                    imageList.add(SlideModel(R.drawable.image_1,ScaleTypes.FIT))
                    imageList.add(SlideModel(R.drawable.images_2,ScaleTypes.FIT))
                    imageList.add(SlideModel(R.drawable.images_3,ScaleTypes.FIT))
                    imageList.add(SlideModel(R.drawable.images_4,ScaleTypes.FIT))
                    imageslider.setImageList(imageList,ScaleTypes.FIT)

                }
        }


/*

          view.findViewById<ImageButton>(R.id.blogs).setOnClickListener{val intent  = Intent(
              Intent.ACTION_VIEW, Uri.parse(
                  "https://nuawoman.com/blog/6-tips-for-good-menstrual-hygiene/"
              )
          )

              getActivity()?.startActivity(intent)}
*/





