package com.example.four;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.four.databinding.FragmentRecyclerViewBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFragment extends Fragment {

    private FragmentRecyclerViewBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentRecyclerViewBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private List<MuzeiListItem> initList() {
        List<MuzeiListItem> list = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            list.add(
                    new MuzeiListItem(
                            R.drawable.ic_launcher_background,
                            getString(R.string.muzei_list_item_title, String.valueOf(i)))

            );
        }
        return list;
    }
}
