package com.plat.brown;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SignUpAdapter extends FragmentStateAdapter {
    public SignUpAdapter(FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }
    @Nullable
    @Override
    public Fragment createFragment(int position){
        Fragment fragment = new EPSignUpFragment();
        Bundle args = new Bundle();
        args.putInt(EPSignUpFragment.ARG_POS, position);
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public int getItemCount(){
        return 2;
    }
}
