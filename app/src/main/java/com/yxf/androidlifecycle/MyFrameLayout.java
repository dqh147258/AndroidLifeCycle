package com.yxf.androidlifecycle;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;

/**
 * Created by jk on 2017/12/9.
 */

public class MyFrameLayout extends FrameLayout {
    public MyFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyFrameLayout(Context context) {
        this(context, null, 0);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Logs.method();
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        Logs.method();
        super.onWindowFocusChanged(hasWindowFocus);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        Logs.method();
        return super.onTrackballEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Logs.method();
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Logs.method();
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        Logs.method();
        return super.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        Logs.method();
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Logs.method();
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        Logs.method();
        return super.onGenericMotionEvent(event);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        Logs.method();
        super.onRestoreInstanceState(state);
    }

    @Override
    protected boolean onSetAlpha(int alpha) {
        Logs.method();
        return super.onSetAlpha(alpha);
    }

    @Override
    protected int[] onCreateDrawableState(int extraSpace) {
        Logs.method();
        return super.onCreateDrawableState(extraSpace);
    }

    @Nullable
    @Override
    protected Parcelable onSaveInstanceState() {
        Logs.method();
        return super.onSaveInstanceState();
    }

    @Override
    protected void onAnimationEnd() {
        Logs.method();
        super.onAnimationEnd();
    }

    @Override
    protected void onAnimationStart() {
        Logs.method();
        super.onAnimationStart();
    }

    @Override
    protected void onAttachedToWindow() {
        Logs.method();
        super.onAttachedToWindow();
    }

    @Override
    protected void onConfigurationChanged(Configuration newConfig) {
        Logs.method();
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onCreateContextMenu(ContextMenu menu) {
        Logs.method();
        super.onCreateContextMenu(menu);
    }

    @Override
    protected void onDetachedFromWindow() {
        Logs.method();
        super.onDetachedFromWindow();
    }

    @Override
    protected void onDisplayHint(int hint) {
        Logs.method();
        super.onDisplayHint(hint);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Logs.method();
        super.onDraw(canvas);
    }

    @Override
    protected void onFinishInflate() {
        Logs.method();
        super.onFinishInflate();
    }

    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        Logs.method();
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Logs.method();
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Logs.method();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        Logs.method();
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        Logs.method();
        super.onScrollChanged(l, t, oldl, oldt);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        Logs.method();
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onVisibilityChanged(@NonNull View changedView, int visibility) {
        Logs.method();
        super.onVisibilityChanged(changedView, visibility);
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        Logs.method();
        super.onWindowVisibilityChanged(visibility);
    }

    @Override
    public boolean onCapturedPointerEvent(MotionEvent event) {
        Logs.method();
        return super.onCapturedPointerEvent(event);
    }

    @Override
    public boolean onCheckIsTextEditor() {
        Logs.method();
        return super.onCheckIsTextEditor();
    }

    @Override
    public boolean onDragEvent(DragEvent event) {
        Logs.method();
        return super.onDragEvent(event);
    }

    @Override
    public boolean onFilterTouchEventForSecurity(MotionEvent event) {
        Logs.method();
        return super.onFilterTouchEventForSecurity(event);
    }

    @Override
    public boolean onHoverEvent(MotionEvent event) {
        Logs.method();
        return super.onHoverEvent(event);
    }

    @Override
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        Logs.method();
        return super.onKeyPreIme(keyCode, event);
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Logs.method();
        return super.onCreateInputConnection(outAttrs);
    }

    @Override
    public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
        Logs.method();
        return super.onResolvePointerIcon(event, pointerIndex);
    }

    @Override
    public void onCancelPendingInputEvents() {
        Logs.method();
        super.onCancelPendingInputEvents();
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
        Logs.method();
        super.onDrawForeground(canvas);
    }

    @Override
    public void onFinishTemporaryDetach() {
        Logs.method();
        super.onFinishTemporaryDetach();
    }

    @Override
    public void onHoverChanged(boolean hovered) {
        Logs.method();
        super.onHoverChanged(hovered);
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        Logs.method();
        super.onInitializeAccessibilityEvent(event);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Logs.method();
        super.onInitializeAccessibilityNodeInfo(info);
    }

    @Override
    public void onPointerCaptureChange(boolean hasCapture) {
        Logs.method();
        super.onPointerCaptureChange(hasCapture);
    }

    @Override
    public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
        Logs.method();
        super.onPopulateAccessibilityEvent(event);
    }

    @Override
    public void onProvideAutofillStructure(ViewStructure structure, int flags) {
        Logs.method();
        super.onProvideAutofillStructure(structure, flags);
    }

    @Override
    public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
        Logs.method();
        super.onProvideAutofillVirtualStructure(structure, flags);
    }

    @Override
    public void onProvideStructure(ViewStructure structure) {
        Logs.method();
        super.onProvideStructure(structure);
    }

    @Override
    public void onProvideVirtualStructure(ViewStructure structure) {
        Logs.method();
        super.onProvideVirtualStructure(structure);
    }

    @Override
    public void onRtlPropertiesChanged(int layoutDirection) {
        Logs.method();
        super.onRtlPropertiesChanged(layoutDirection);
    }

    @Override
    public void onScreenStateChanged(int screenState) {
        Logs.method();
        super.onScreenStateChanged(screenState);
    }

    @Override
    public void onStartTemporaryDetach() {
        Logs.method();
        super.onStartTemporaryDetach();
    }

    @Override
    public void onVisibilityAggregated(boolean isVisible) {
        Logs.method();
        super.onVisibilityAggregated(isVisible);
    }

    @Override
    public void onWindowSystemUiVisibilityChanged(int visible) {
        Logs.method();
        super.onWindowSystemUiVisibilityChanged(visible);
    }

    @Override
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Logs.method();
        return super.onApplyWindowInsets(insets);
    }

    @Override
    protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        Logs.method();
        return super.onRequestFocusInDescendants(direction, previouslyFocusedRect);
    }

    @Override
    public boolean onInterceptHoverEvent(MotionEvent event) {
        Logs.method();
        return super.onInterceptHoverEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Logs.method();
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        Logs.method();
        return super.onNestedFling(target, velocityX, velocityY, consumed);
    }

    @Override
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        Logs.method();
        return super.onNestedPreFling(target, velocityX, velocityY);
    }

    @Override
    public boolean onNestedPrePerformAccessibilityAction(View target, int action, Bundle args) {
        Logs.method();
        return super.onNestedPrePerformAccessibilityAction(target, action, args);
    }

    @Override
    public boolean onRequestSendAccessibilityEvent(View child, AccessibilityEvent event) {
        Logs.method();
        return super.onRequestSendAccessibilityEvent(child, event);
    }

    @Override
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        Logs.method();
        return super.onStartNestedScroll(child, target, nestedScrollAxes);
    }

    @Override
    public void onDescendantInvalidated(@NonNull View child, @NonNull View target) {
        Logs.method();
        super.onDescendantInvalidated(child, target);
    }

    @Override
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        Logs.method();
        super.onNestedPreScroll(target, dx, dy, consumed);
    }

    @Override
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        Logs.method();
        super.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
    }

    @Override
    public void onNestedScrollAccepted(View child, View target, int axes) {
        Logs.method();
        super.onNestedScrollAccepted(child, target, axes);
    }

    @Override
    public void onStopNestedScroll(View child) {
        Logs.method();
        super.onStopNestedScroll(child);
    }

    @Override
    public void onViewAdded(View child) {
        Logs.method();
        super.onViewAdded(child);
    }

    @Override
    public void onViewRemoved(View child) {
        Logs.method();
        super.onViewRemoved(child);
    }
}
