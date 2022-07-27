package com.udacity.shoestore;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.udacity.shoestore.databinding.ActivityMainBindingImpl;
import com.udacity.shoestore.databinding.FragmentInstructionScreenBindingImpl;
import com.udacity.shoestore.databinding.FragmentListBlocksBindingImpl;
import com.udacity.shoestore.databinding.FragmentLoginBindingImpl;
import com.udacity.shoestore.databinding.FragmentShoeDetailBindingImpl;
import com.udacity.shoestore.databinding.FragmentShoeListBindingImpl;
import com.udacity.shoestore.databinding.FragmentWelcomeScreenBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTINSTRUCTIONSCREEN = 2;

  private static final int LAYOUT_FRAGMENTLISTBLOCKS = 3;

  private static final int LAYOUT_FRAGMENTLOGIN = 4;

  private static final int LAYOUT_FRAGMENTSHOEDETAIL = 5;

  private static final int LAYOUT_FRAGMENTSHOELIST = 6;

  private static final int LAYOUT_FRAGMENTWELCOMESCREEN = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.shoestore.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.shoestore.R.layout.fragment_instruction_screen, LAYOUT_FRAGMENTINSTRUCTIONSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.shoestore.R.layout.fragment_list_blocks, LAYOUT_FRAGMENTLISTBLOCKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.shoestore.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.shoestore.R.layout.fragment_shoe_detail, LAYOUT_FRAGMENTSHOEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.shoestore.R.layout.fragment_shoe_list, LAYOUT_FRAGMENTSHOELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.shoestore.R.layout.fragment_welcome_screen, LAYOUT_FRAGMENTWELCOMESCREEN);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINSTRUCTIONSCREEN: {
          if ("layout/fragment_instruction_screen_0".equals(tag)) {
            return new FragmentInstructionScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_instruction_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLISTBLOCKS: {
          if ("layout/fragment_list_blocks_0".equals(tag)) {
            return new FragmentListBlocksBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list_blocks is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOEDETAIL: {
          if ("layout/fragment_shoe_detail_0".equals(tag)) {
            return new FragmentShoeDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_shoe_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOELIST: {
          if ("layout/fragment_shoe_list_0".equals(tag)) {
            return new FragmentShoeListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_shoe_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWELCOMESCREEN: {
          if ("layout/fragment_welcome_screen_0".equals(tag)) {
            return new FragmentWelcomeScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_welcome_screen is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModelshoe");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.udacity.shoestore.R.layout.activity_main);
      sKeys.put("layout/fragment_instruction_screen_0", com.udacity.shoestore.R.layout.fragment_instruction_screen);
      sKeys.put("layout/fragment_list_blocks_0", com.udacity.shoestore.R.layout.fragment_list_blocks);
      sKeys.put("layout/fragment_login_0", com.udacity.shoestore.R.layout.fragment_login);
      sKeys.put("layout/fragment_shoe_detail_0", com.udacity.shoestore.R.layout.fragment_shoe_detail);
      sKeys.put("layout/fragment_shoe_list_0", com.udacity.shoestore.R.layout.fragment_shoe_list);
      sKeys.put("layout/fragment_welcome_screen_0", com.udacity.shoestore.R.layout.fragment_welcome_screen);
    }
  }
}
