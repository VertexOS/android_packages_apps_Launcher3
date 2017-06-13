package com.android.launcher3;

import android.content.ComponentName;
import java.util.HashSet;

public class NexusAppFilter extends AppFilter
{
    private final HashSet mHide;

    public NexusAppFilter() {
        mHide = new HashSet();
        mHide.add(ComponentName.unflattenFromString("com.google.android.googlequicksearchbox/.VoiceSearchActivity"));
        mHide.add(ComponentName.unflattenFromString("com.google.android.apps.wallpaper/.picker.CategoryPickerActivity"));
    }

    public boolean shouldShowApp(final ComponentName componentName) {
        return !mHide.contains(componentName);
    }
}
