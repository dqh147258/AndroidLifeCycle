package com.yxf.androidlifecycle;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/**
 * Created by jk on 2017/12/9.
 */

public class MyFragment extends Fragment {
    ViewGroup rootView;
    View child;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Logs.method();
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        Logs.method();
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onLowMemory() {
        Logs.method();
        super.onLowMemory();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Logs.method();
        super.onConfigurationChanged(newConfig);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Logs.method();
        super.onCreateView(inflater, container, savedInstanceState);
        rootView = (ViewGroup) getLayoutInflater().inflate(R.layout.fragment_main, null);
        child = rootView.findViewById(R.id.child);
        return rootView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Logs.method();
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        Logs.method();
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        Logs.method();
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        Logs.method();
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        Logs.method();
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        Logs.method();
        super.onAttachFragment(childFragment);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Logs.method();
        switch (item.getItemId()) {
            case R.id.fragment_menu_view_invalidate:
                child.invalidate();
                break;
            case R.id.fragment_menu_view_request_layout:
                child.requestLayout();
                break;
            case R.id.fragment_menu_view_group_invalidate:
                rootView.invalidate();
                break;
            case R.id.fragment_menu_view_group_request_layout:
                rootView.requestLayout();
                break;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Logs.method();
        return super.onContextItemSelected(item);
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        Logs.method();
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    @Override
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        Logs.method();
        return super.onCreateAnimator(transit, enter, nextAnim);
    }

    @Override
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        Logs.method();
        return super.onGetLayoutInflater(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Logs.method();
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Logs.method();
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onAttach(Context context) {
        Logs.method();
        super.onAttach(context);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Logs.method();
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.fragment_main, menu);
    }

    @Override
    public void onDestroy() {
        Logs.method();
        super.onDestroy();
    }

    @Override
    public void onDestroyOptionsMenu() {
        Logs.method();
        super.onDestroyOptionsMenu();
    }

    @Override
    public void onDestroyView() {
        Logs.method();
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        Logs.method();
        super.onDetach();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        Logs.method();
        super.onHiddenChanged(hidden);
    }

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        Logs.method();
        super.onInflate(context, attrs, savedInstanceState);
    }

    @Override
    public void onPause() {
        Logs.method();
        super.onPause();
    }

    @Override
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        Logs.method();
        super.onInflate(activity, attrs, savedInstanceState);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        Logs.method();
        super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onResume() {
        Logs.method();
        super.onResume();
    }

    @Override
    public void onStart() {
        Logs.method();
        super.onStart();
    }

    @Override
    public void onStop() {
        Logs.method();
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Logs.method();
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Logs.method();
        super.onViewStateRestored(savedInstanceState);
    }
}
