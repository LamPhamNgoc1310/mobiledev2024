package vn.edu.usth.midgroupproject.library;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import vn.edu.usth.midgroupproject.R;
import vn.edu.usth.midgroupproject.liked.LikedSongsPageFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LibraryPageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LibraryPageFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LibraryPageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LibraryPageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LibraryPageFragment newInstance(String param1, String param2) {
        LibraryPageFragment fragment = new LibraryPageFragment();
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
        View view = inflater.inflate(R.layout.fragment_library_page, container, false);

        LinearLayout linearLayout1 = view.findViewById(R.id.liked_playlist);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                navigateToFragment(new LikedSongsPageFragment());
            }
        });

        return view;
    }

    public void navigateToFragment(Fragment fragment) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.library_page, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}