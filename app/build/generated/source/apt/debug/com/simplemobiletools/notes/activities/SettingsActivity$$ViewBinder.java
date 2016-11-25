// Generated code from Butter Knife. Do not modify!
package com.simplemobiletools.notes.activities;

import android.view.View;
import android.widget.AdapterView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SettingsActivity$$ViewBinder<T extends SettingsActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558516, "field 'mDarkThemeSwitch'");
    target.mDarkThemeSwitch = finder.castView(view, 2131558516, "field 'mDarkThemeSwitch'");
    view = finder.findRequiredView(source, 2131558519, "field 'mFontSizeSpinner' and method 'handleFontSize'");
    target.mFontSizeSpinner = finder.castView(view, 2131558519, "field 'mFontSizeSpinner'");
    unbinder.view2131558519 = view;
    ((AdapterView<?>) view).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> p0, View p1, int p2, long p3) {
        target.handleFontSize();
      }

      @Override
      public void onNothingSelected(AdapterView<?> p0) {
      }
    });
    view = finder.findRequiredView(source, 2131558514, "method 'handleDarkTheme'");
    unbinder.view2131558514 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.handleDarkTheme();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SettingsActivity> implements Unbinder {
    private T target;

    View view2131558519;

    View view2131558514;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.mDarkThemeSwitch = null;
      ((AdapterView<?>) view2131558519).setOnItemSelectedListener(null);
      target.mFontSizeSpinner = null;
      view2131558514.setOnClickListener(null);
    }
  }
}
