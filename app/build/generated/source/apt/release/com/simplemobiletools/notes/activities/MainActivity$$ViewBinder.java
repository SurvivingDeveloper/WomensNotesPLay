// Generated code from Butter Knife. Do not modify!
package com.simplemobiletools.notes.activities;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MainActivity$$ViewBinder<T extends MainActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558510, "field 'mNotesView'");
    target.mNotesView = finder.castView(view, 2131558510, "field 'mNotesView'");
    view = finder.findRequiredView(source, 2131558507, "field 'mCurrNoteLabel'");
    target.mCurrNoteLabel = finder.castView(view, 2131558507, "field 'mCurrNoteLabel'");
    view = finder.findRequiredView(source, 2131558508, "field 'mCurrNoteTitle'");
    target.mCurrNoteTitle = finder.castView(view, 2131558508, "field 'mCurrNoteTitle'");
    view = finder.findRequiredView(source, 2131558511, "method 'fabClicked'");
    unbinder.view2131558511 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.fabClicked(p0);
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends MainActivity> implements Unbinder {
    private T target;

    View view2131558511;

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
      target.mNotesView = null;
      target.mCurrNoteLabel = null;
      target.mCurrNoteTitle = null;
      view2131558511.setOnClickListener(null);
    }
  }
}
