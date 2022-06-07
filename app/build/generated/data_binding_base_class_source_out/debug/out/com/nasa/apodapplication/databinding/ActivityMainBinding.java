// Generated by view binder compiler. Do not edit!
package com.nasa.apodapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nasa.apodapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btnCalender;

  @NonNull
  public final ImageView btnLike;

  @NonNull
  public final TextView dateHeader;

  @NonNull
  public final TextView dateValue;

  @NonNull
  public final TextView expHeader;

  @NonNull
  public final TextView expValue;

  @NonNull
  public final TextView imgHeader;

  @NonNull
  public final ImageView imgNasapic;

  @NonNull
  public final ConstraintLayout layoutImg;

  @NonNull
  public final TextView titleHeader;

  @NonNull
  public final TextView titleValue;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull ImageView btnCalender,
      @NonNull ImageView btnLike, @NonNull TextView dateHeader, @NonNull TextView dateValue,
      @NonNull TextView expHeader, @NonNull TextView expValue, @NonNull TextView imgHeader,
      @NonNull ImageView imgNasapic, @NonNull ConstraintLayout layoutImg,
      @NonNull TextView titleHeader, @NonNull TextView titleValue) {
    this.rootView = rootView;
    this.btnCalender = btnCalender;
    this.btnLike = btnLike;
    this.dateHeader = dateHeader;
    this.dateValue = dateValue;
    this.expHeader = expHeader;
    this.expValue = expValue;
    this.imgHeader = imgHeader;
    this.imgNasapic = imgNasapic;
    this.layoutImg = layoutImg;
    this.titleHeader = titleHeader;
    this.titleValue = titleValue;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_calender;
      ImageView btnCalender = ViewBindings.findChildViewById(rootView, id);
      if (btnCalender == null) {
        break missingId;
      }

      id = R.id.btn_like;
      ImageView btnLike = ViewBindings.findChildViewById(rootView, id);
      if (btnLike == null) {
        break missingId;
      }

      id = R.id.date_header;
      TextView dateHeader = ViewBindings.findChildViewById(rootView, id);
      if (dateHeader == null) {
        break missingId;
      }

      id = R.id.date_value;
      TextView dateValue = ViewBindings.findChildViewById(rootView, id);
      if (dateValue == null) {
        break missingId;
      }

      id = R.id.exp_header;
      TextView expHeader = ViewBindings.findChildViewById(rootView, id);
      if (expHeader == null) {
        break missingId;
      }

      id = R.id.exp_value;
      TextView expValue = ViewBindings.findChildViewById(rootView, id);
      if (expValue == null) {
        break missingId;
      }

      id = R.id.img_header;
      TextView imgHeader = ViewBindings.findChildViewById(rootView, id);
      if (imgHeader == null) {
        break missingId;
      }

      id = R.id.img_nasapic;
      ImageView imgNasapic = ViewBindings.findChildViewById(rootView, id);
      if (imgNasapic == null) {
        break missingId;
      }

      id = R.id.layout_img;
      ConstraintLayout layoutImg = ViewBindings.findChildViewById(rootView, id);
      if (layoutImg == null) {
        break missingId;
      }

      id = R.id.title_header;
      TextView titleHeader = ViewBindings.findChildViewById(rootView, id);
      if (titleHeader == null) {
        break missingId;
      }

      id = R.id.title_value;
      TextView titleValue = ViewBindings.findChildViewById(rootView, id);
      if (titleValue == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, btnCalender, btnLike, dateHeader,
          dateValue, expHeader, expValue, imgHeader, imgNasapic, layoutImg, titleHeader,
          titleValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}