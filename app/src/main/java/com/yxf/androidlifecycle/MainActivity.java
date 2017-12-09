package com.yxf.androidlifecycle;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.TaskStackBuilder;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.WindowManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Logs.method();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.container, new MyFragment()).commit();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        Logs.method();
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onStart() {
        Logs.method();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Logs.method();
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Logs.method();
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Logs.method();
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onRestart() {
        Logs.method();
        super.onRestart();
    }

    @Override
    protected void onChildTitleChanged(Activity childActivity, CharSequence title) {
        Logs.method();
        super.onChildTitleChanged(childActivity, title);
    }

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        Logs.method();
        super.onApplyThemeResource(theme, resid, first);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Logs.method();
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onUserLeaveHint() {
        Logs.method();
        super.onUserLeaveHint();
    }

    @Nullable
    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Logs.method();
        return super.onWindowStartingActionMode(callback);
    }

    @Nullable
    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        Logs.method();
        return super.onWindowStartingActionMode(callback, type);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Logs.method();
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        Logs.method();
        return super.onCreateThumbnail(outBitmap, canvas);
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        Logs.method();
        return super.onGenericMotionEvent(event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Logs.method();
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        Logs.method();
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        Logs.method();
        return super.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Logs.method();
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onNavigateUp() {
        Logs.method();
        return super.onNavigateUp();
    }

    @Override
    public boolean onNavigateUpFromChild(Activity child) {
        Logs.method();
        return super.onNavigateUpFromChild(child);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Logs.method();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSearchRequested() {
        Logs.method();
        return super.onSearchRequested();
    }

    @Override
    public boolean onSearchRequested(@Nullable SearchEvent searchEvent) {
        Logs.method();
        return super.onSearchRequested(searchEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Logs.method();
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        Logs.method();
        return super.onTrackballEvent(event);
    }

    @Nullable
    @Override
    public CharSequence onCreateDescription() {
        Logs.method();
        return super.onCreateDescription();
    }

    @Override
    public Uri onProvideReferrer() {
        Logs.method();
        return super.onProvideReferrer();
    }

    @Nullable
    @Override
    public View onCreatePanelView(int featureId) {
        Logs.method();
        return super.onCreatePanelView(featureId);
    }

    @Override
    public void onActionModeFinished(ActionMode mode) {
        Logs.method();
        super.onActionModeFinished(mode);
    }

    @Override
    public void onActionModeStarted(ActionMode mode) {
        Logs.method();
        super.onActionModeStarted(mode);
    }

    @Override
    public void onActivityReenter(int resultCode, Intent data) {
        Logs.method();
        super.onActivityReenter(resultCode, data);
    }

    @Override
    public void onAttachedToWindow() {
        Logs.method();
        super.onAttachedToWindow();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        Logs.method();
        super.onAttachFragment(fragment);
    }

    @Override
    public void onContextMenuClosed(Menu menu) {
        Logs.method();
        super.onContextMenuClosed(menu);
    }

    @Override
    public void onAttachFragment(android.support.v4.app.Fragment fragment) {
        Logs.method();
        super.onAttachFragment(fragment);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        Logs.method();
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public void onCreateNavigateUpTaskStack(TaskStackBuilder builder) {
        Logs.method();
        super.onCreateNavigateUpTaskStack(builder);
    }

    @Override
    public void onDetachedFromWindow() {
        Logs.method();
        super.onDetachedFromWindow();
    }

    @Override
    public void onEnterAnimationComplete() {
        Logs.method();
        super.onEnterAnimationComplete();
    }

    @Override
    public void onLocalVoiceInteractionStarted() {
        Logs.method();
        super.onLocalVoiceInteractionStarted();
    }

    @Override
    public void onLocalVoiceInteractionStopped() {
        Logs.method();
        super.onLocalVoiceInteractionStopped();
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        Logs.method();
        super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        Logs.method();
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        Logs.method();
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        Logs.method();
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        Logs.method();
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        Logs.method();
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        Logs.method();
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onPrepareNavigateUpTaskStack(TaskStackBuilder builder) {
        Logs.method();
        super.onPrepareNavigateUpTaskStack(builder);
    }

    @Override
    public void onProvideAssistContent(AssistContent outContent) {
        Logs.method();
        super.onProvideAssistContent(outContent);
    }

    @Override
    public void onProvideAssistData(Bundle data) {
        Logs.method();
        super.onProvideAssistData(data);
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
        Logs.method();
        super.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        Logs.method();
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Logs.method();
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public void onTrimMemory(int level) {
        Logs.method();
        super.onTrimMemory(level);
    }

    @Override
    public void onUserInteraction() {
        Logs.method();
        super.onUserInteraction();
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        Logs.method();
        super.onWindowAttributesChanged(params);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        Logs.method();
        super.onWindowFocusChanged(hasFocus);
    }

    @SuppressLint("RestrictedApi")
    @Override
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        Logs.method();
        return super.onPrepareOptionsPanel(view, menu);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Logs.method();
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        Logs.method();
        super.onDestroy();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Logs.method();
        super.onNewIntent(intent);
    }

    @Override
    protected void onPause() {
        Logs.method();
        super.onPause();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        Logs.method();
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onPostResume() {
        Logs.method();
        super.onPostResume();
    }

    @Override
    protected void onResumeFragments() {
        Logs.method();
        super.onResumeFragments();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Logs.method();
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        Logs.method();
        super.onStop();
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        Logs.method();
        super.onTitleChanged(title, color);
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        Logs.method();
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Logs.method();
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        Logs.method();
        return super.onMenuOpened(featureId, menu);
    }

    @Override
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        Logs.method();
        return super.onPreparePanel(featureId, view, menu);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Logs.method();
        return super.onSupportNavigateUp();
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        Logs.method();
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    public void onBackPressed() {
        Logs.method();
        super.onBackPressed();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Logs.method();
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onContentChanged() {
        Logs.method();
        super.onContentChanged();
    }

    @Override
    public void onCreateSupportNavigateUpTaskStack(@NonNull android.support.v4.app.TaskStackBuilder builder) {
        Logs.method();
        super.onCreateSupportNavigateUpTaskStack(builder);
    }

    @Override
    public void onLowMemory() {
        Logs.method();
        super.onLowMemory();
    }

    @Override
    public void onPanelClosed(int featureId, Menu menu) {
        Logs.method();
        super.onPanelClosed(featureId, menu);
    }

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        Logs.method();
        return super.onRetainCustomNonConfigurationInstance();
    }

    @Nullable
    @Override
    public android.support.v7.view.ActionMode onWindowStartingSupportActionMode(@NonNull android.support.v7.view.ActionMode.Callback callback) {
        Logs.method();
        return super.onWindowStartingSupportActionMode(callback);
    }

    @Override
    public void onPrepareSupportNavigateUpTaskStack(@NonNull android.support.v4.app.TaskStackBuilder builder) {
        Logs.method();
        super.onPrepareSupportNavigateUpTaskStack(builder);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        Logs.method();
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onStateNotSaved() {
        Logs.method();
        super.onStateNotSaved();
    }

    @Override
    public void onSupportActionModeFinished(@NonNull android.support.v7.view.ActionMode mode) {
        Logs.method();
        super.onSupportActionModeFinished(mode);
    }

    @Override
    public void onSupportActionModeStarted(@NonNull android.support.v7.view.ActionMode mode) {
        Logs.method();
        super.onSupportActionModeStarted(mode);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        Logs.method();
        return super.onCreateDialog(id);
    }

    @Nullable
    @Override
    protected Dialog onCreateDialog(int id, Bundle args) {
        Logs.method();
        return super.onCreateDialog(id, args);
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog) {
        Logs.method();
        super.onPrepareDialog(id, dialog);
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog, Bundle args) {
        Logs.method();
        super.onPrepareDialog(id, dialog, args);
    }

    @Override
    public void onVisibleBehindCanceled() {
        Logs.method();
        super.onVisibleBehindCanceled();
    }

    @Override
    public void onSupportContentChanged() {
        Logs.method();
        super.onSupportContentChanged();
    }
}


