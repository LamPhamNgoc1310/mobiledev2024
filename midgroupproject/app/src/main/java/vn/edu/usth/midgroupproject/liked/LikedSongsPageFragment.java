package vn.edu.usth.midgroupproject.liked;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import vn.edu.usth.midgroupproject.R;
import vn.edu.usth.midgroupproject.songs.SongFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LikedSongsPageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LikedSongsPageFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LikedSongsPageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LikedSongsPageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LikedSongsPageFragment newInstance(String param1, String param2) {
        LikedSongsPageFragment fragment = new LikedSongsPageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_liked_songs_page, container, false);

        RelativeLayout relativeLayout1 = view.findViewById(R.id.song1);
        RelativeLayout relativeLayout2 = view.findViewById(R.id.song2);
        RelativeLayout relativeLayout3 = view.findViewById(R.id.song3);
//      Navigation of song 1
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToFragment(new SongFragment());
            }
        });
//        Navigation of song 2
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToFragment(new SongFragment());
            }
        });
//        Navigation of song 3
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToFragment(new SongFragment());
            }
        });

        return view;
    }
//    Navigation function
    public void navigateToFragment(Fragment fragment) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_likedSongsPage, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}