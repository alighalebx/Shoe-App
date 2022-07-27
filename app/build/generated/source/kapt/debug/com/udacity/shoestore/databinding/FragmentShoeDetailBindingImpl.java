package com.udacity.shoestore.databinding;
import com.udacity.shoestore.R;
import com.udacity.shoestore.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentShoeDetailBindingImpl extends FragmentShoeDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 5);
        sViewsWithIds.put(R.id.textname, 6);
        sViewsWithIds.put(R.id.textCompany, 7);
        sViewsWithIds.put(R.id.textSize, 8);
        sViewsWithIds.put(R.id.textDescription, 9);
        sViewsWithIds.put(R.id.save, 10);
        sViewsWithIds.put(R.id.cancel, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener CompanyandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModelshoe.shoe.getValue().company
            //         is viewModelshoe.shoe.getValue().setCompany((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(Company);
            // localize variables for thread safety
            // viewModelshoe.shoe != null
            boolean viewModelshoeShoeJavaLangObjectNull = false;
            // viewModelshoe.shoe.getValue() != null
            boolean viewModelshoeShoeGetValueJavaLangObjectNull = false;
            // viewModelshoe
            com.udacity.shoestore.AppViewModel viewModelshoe = mViewModelshoe;
            // viewModelshoe.shoe.getValue()
            com.udacity.shoestore.models.Shoe viewModelshoeShoeGetValue = null;
            // viewModelshoe.shoe
            androidx.lifecycle.MutableLiveData<com.udacity.shoestore.models.Shoe> viewModelshoeShoe = null;
            // viewModelshoe.shoe.getValue().company
            java.lang.String viewModelshoeShoeCompany = null;
            // viewModelshoe != null
            boolean viewModelshoeJavaLangObjectNull = false;



            viewModelshoeJavaLangObjectNull = (viewModelshoe) != (null);
            if (viewModelshoeJavaLangObjectNull) {


                viewModelshoeShoe = viewModelshoe.getShoe();

                viewModelshoeShoeJavaLangObjectNull = (viewModelshoeShoe) != (null);
                if (viewModelshoeShoeJavaLangObjectNull) {


                    viewModelshoeShoeGetValue = viewModelshoeShoe.getValue();

                    viewModelshoeShoeGetValueJavaLangObjectNull = (viewModelshoeShoeGetValue) != (null);
                    if (viewModelshoeShoeGetValueJavaLangObjectNull) {




                        viewModelshoeShoeGetValue.setCompany(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener DescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModelshoe.shoe.getValue().description
            //         is viewModelshoe.shoe.getValue().setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(Description);
            // localize variables for thread safety
            // viewModelshoe.shoe != null
            boolean viewModelshoeShoeJavaLangObjectNull = false;
            // viewModelshoe.shoe.getValue().description
            java.lang.String viewModelshoeShoeDescription = null;
            // viewModelshoe.shoe.getValue() != null
            boolean viewModelshoeShoeGetValueJavaLangObjectNull = false;
            // viewModelshoe
            com.udacity.shoestore.AppViewModel viewModelshoe = mViewModelshoe;
            // viewModelshoe.shoe.getValue()
            com.udacity.shoestore.models.Shoe viewModelshoeShoeGetValue = null;
            // viewModelshoe.shoe
            androidx.lifecycle.MutableLiveData<com.udacity.shoestore.models.Shoe> viewModelshoeShoe = null;
            // viewModelshoe != null
            boolean viewModelshoeJavaLangObjectNull = false;



            viewModelshoeJavaLangObjectNull = (viewModelshoe) != (null);
            if (viewModelshoeJavaLangObjectNull) {


                viewModelshoeShoe = viewModelshoe.getShoe();

                viewModelshoeShoeJavaLangObjectNull = (viewModelshoeShoe) != (null);
                if (viewModelshoeShoeJavaLangObjectNull) {


                    viewModelshoeShoeGetValue = viewModelshoeShoe.getValue();

                    viewModelshoeShoeGetValueJavaLangObjectNull = (viewModelshoeShoeGetValue) != (null);
                    if (viewModelshoeShoeGetValueJavaLangObjectNull) {




                        viewModelshoeShoeGetValue.setDescription(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener ShoenameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModelshoe.shoe.getValue().name
            //         is viewModelshoe.shoe.getValue().setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(Shoename);
            // localize variables for thread safety
            // viewModelshoe.shoe != null
            boolean viewModelshoeShoeJavaLangObjectNull = false;
            // viewModelshoe.shoe.getValue() != null
            boolean viewModelshoeShoeGetValueJavaLangObjectNull = false;
            // viewModelshoe
            com.udacity.shoestore.AppViewModel viewModelshoe = mViewModelshoe;
            // viewModelshoe.shoe.getValue()
            com.udacity.shoestore.models.Shoe viewModelshoeShoeGetValue = null;
            // viewModelshoe.shoe
            androidx.lifecycle.MutableLiveData<com.udacity.shoestore.models.Shoe> viewModelshoeShoe = null;
            // viewModelshoe.shoe.getValue().name
            java.lang.String viewModelshoeShoeName = null;
            // viewModelshoe != null
            boolean viewModelshoeJavaLangObjectNull = false;



            viewModelshoeJavaLangObjectNull = (viewModelshoe) != (null);
            if (viewModelshoeJavaLangObjectNull) {


                viewModelshoeShoe = viewModelshoe.getShoe();

                viewModelshoeShoeJavaLangObjectNull = (viewModelshoeShoe) != (null);
                if (viewModelshoeShoeJavaLangObjectNull) {


                    viewModelshoeShoeGetValue = viewModelshoeShoe.getValue();

                    viewModelshoeShoeGetValueJavaLangObjectNull = (viewModelshoeShoeGetValue) != (null);
                    if (viewModelshoeShoeGetValueJavaLangObjectNull) {




                        viewModelshoeShoeGetValue.setName(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener ShoesizeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of (viewModelshoe.shoe.getValue().size) + ("")
            //         is viewModelshoe.shoe.getValue().setSize((double) androidx.databinding.ViewDataBinding.parse(callbackArg_0, viewModelshoe.shoe.getValue().size))
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(Shoesize);
            // localize variables for thread safety
            // viewModelshoe.shoe != null
            boolean viewModelshoeShoeJavaLangObjectNull = false;
            // viewModelshoe.shoe.getValue() != null
            boolean viewModelshoeShoeGetValueJavaLangObjectNull = false;
            // viewModelshoe
            com.udacity.shoestore.AppViewModel viewModelshoe = mViewModelshoe;
            // androidx.databinding.ViewDataBinding.parse(callbackArg_0, viewModelshoe.shoe.getValue().size)
            double androidxDatabindingViewDataBindingParseCallbackArg0ViewModelshoeShoeSize = 0.0;
            // viewModelshoe.shoe
            androidx.lifecycle.MutableLiveData<com.udacity.shoestore.models.Shoe> viewModelshoeShoe = null;
            // (viewModelshoe.shoe.getValue().size) + ("")
            java.lang.String viewModelshoeShoeSizeJavaLangString = null;
            // viewModelshoe.shoe.getValue()
            com.udacity.shoestore.models.Shoe viewModelshoeShoeGetValue = null;
            // viewModelshoe.shoe.getValue().size
            double viewModelshoeShoeSize = 0.0;
            // (double) androidx.databinding.ViewDataBinding.parse(callbackArg_0, viewModelshoe.shoe.getValue().size)
            double doubleAndroidxDatabindingViewDataBindingParseCallbackArg0ViewModelshoeShoeSize = 0.0;
            // viewModelshoe != null
            boolean viewModelshoeJavaLangObjectNull = false;



            viewModelshoeJavaLangObjectNull = (viewModelshoe) != (null);
            if (viewModelshoeJavaLangObjectNull) {


                viewModelshoeShoe = viewModelshoe.getShoe();

                viewModelshoeShoeJavaLangObjectNull = (viewModelshoeShoe) != (null);
                if (viewModelshoeShoeJavaLangObjectNull) {


                    viewModelshoeShoeGetValue = viewModelshoeShoe.getValue();

                    viewModelshoeShoeGetValueJavaLangObjectNull = (viewModelshoeShoeGetValue) != (null);
                    if (viewModelshoeShoeGetValueJavaLangObjectNull) {








                        viewModelshoeShoeSize = viewModelshoeShoeGetValue.getSize();

                        androidxDatabindingViewDataBindingParseCallbackArg0ViewModelshoeShoeSize = androidx.databinding.ViewDataBinding.parse(callbackArg_0, viewModelshoeShoeSize);

                        doubleAndroidxDatabindingViewDataBindingParseCallbackArg0ViewModelshoeShoeSize = ((double) (androidxDatabindingViewDataBindingParseCallbackArg0ViewModelshoeShoeSize));

                        viewModelshoeShoeGetValue.setSize(doubleAndroidxDatabindingViewDataBindingParseCallbackArg0ViewModelshoeShoeSize);
                    }
                }
            }
        }
    };

    public FragmentShoeDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentShoeDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.Button) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.Button) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[5]
            );
        this.Company.setTag(null);
        this.Description.setTag(null);
        this.Shoename.setTag(null);
        this.Shoesize.setTag(null);
        this.cont.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModelshoe == variableId) {
            setViewModelshoe((com.udacity.shoestore.AppViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModelshoe(@Nullable com.udacity.shoestore.AppViewModel ViewModelshoe) {
        this.mViewModelshoe = ViewModelshoe;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModelshoe);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelshoeShoe((androidx.lifecycle.MutableLiveData<com.udacity.shoestore.models.Shoe>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelshoeShoe(androidx.lifecycle.MutableLiveData<com.udacity.shoestore.models.Shoe> ViewModelshoeShoe, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelshoeShoeDescription = null;
        com.udacity.shoestore.AppViewModel viewModelshoe = mViewModelshoe;
        java.lang.String viewModelshoeShoeCompany = null;
        double viewModelshoeShoeSize = 0.0;
        androidx.lifecycle.MutableLiveData<com.udacity.shoestore.models.Shoe> viewModelshoeShoe = null;
        java.lang.String viewModelshoeShoeName = null;
        java.lang.String viewModelshoeShoeSizeJavaLangString = null;
        com.udacity.shoestore.models.Shoe viewModelshoeShoeGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModelshoe != null) {
                    // read viewModelshoe.shoe
                    viewModelshoeShoe = viewModelshoe.getShoe();
                }
                updateLiveDataRegistration(0, viewModelshoeShoe);


                if (viewModelshoeShoe != null) {
                    // read viewModelshoe.shoe.getValue()
                    viewModelshoeShoeGetValue = viewModelshoeShoe.getValue();
                }


                if (viewModelshoeShoeGetValue != null) {
                    // read viewModelshoe.shoe.getValue().description
                    viewModelshoeShoeDescription = viewModelshoeShoeGetValue.getDescription();
                    // read viewModelshoe.shoe.getValue().company
                    viewModelshoeShoeCompany = viewModelshoeShoeGetValue.getCompany();
                    // read viewModelshoe.shoe.getValue().size
                    viewModelshoeShoeSize = viewModelshoeShoeGetValue.getSize();
                    // read viewModelshoe.shoe.getValue().name
                    viewModelshoeShoeName = viewModelshoeShoeGetValue.getName();
                }


                // read (viewModelshoe.shoe.getValue().size) + ("")
                viewModelshoeShoeSizeJavaLangString = (viewModelshoeShoeSize) + ("");
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.Company, viewModelshoeShoeCompany);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.Description, viewModelshoeShoeDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.Shoename, viewModelshoeShoeName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.Shoesize, viewModelshoeShoeSizeJavaLangString);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.Company, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, CompanyandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.Description, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, DescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.Shoename, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ShoenameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.Shoesize, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ShoesizeandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModelshoe.shoe
        flag 1 (0x2L): viewModelshoe
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}