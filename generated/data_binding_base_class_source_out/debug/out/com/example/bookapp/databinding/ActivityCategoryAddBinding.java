// Generated by view binder compiler. Do not edit!
package com.example.bookapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bookapp.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCategoryAddBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backBtn;

  @NonNull
  public final EditText categoryEt;

  @NonNull
  public final TextInputLayout categoryTil;

  @NonNull
  public final ImageView iconIv;

  @NonNull
  public final Button submitBtn;

  @NonNull
  public final RelativeLayout toolbarRl;

  private ActivityCategoryAddBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton backBtn, @NonNull EditText categoryEt,
      @NonNull TextInputLayout categoryTil, @NonNull ImageView iconIv, @NonNull Button submitBtn,
      @NonNull RelativeLayout toolbarRl) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.categoryEt = categoryEt;
    this.categoryTil = categoryTil;
    this.iconIv = iconIv;
    this.submitBtn = submitBtn;
    this.toolbarRl = toolbarRl;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCategoryAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCategoryAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_category_add, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCategoryAddBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backBtn;
      ImageButton backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.categoryEt;
      EditText categoryEt = ViewBindings.findChildViewById(rootView, id);
      if (categoryEt == null) {
        break missingId;
      }

      id = R.id.categoryTil;
      TextInputLayout categoryTil = ViewBindings.findChildViewById(rootView, id);
      if (categoryTil == null) {
        break missingId;
      }

      id = R.id.iconIv;
      ImageView iconIv = ViewBindings.findChildViewById(rootView, id);
      if (iconIv == null) {
        break missingId;
      }

      id = R.id.submitBtn;
      Button submitBtn = ViewBindings.findChildViewById(rootView, id);
      if (submitBtn == null) {
        break missingId;
      }

      id = R.id.toolbarRl;
      RelativeLayout toolbarRl = ViewBindings.findChildViewById(rootView, id);
      if (toolbarRl == null) {
        break missingId;
      }

      return new ActivityCategoryAddBinding((ConstraintLayout) rootView, backBtn, categoryEt,
          categoryTil, iconIv, submitBtn, toolbarRl);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
