package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import android.support.annotation.NonNull;

public class InfiniteCriteriaFactory implements ICriteriaFactory {
    @NonNull
    @Override
    public IFinishingCriteria getBackwardFinishingCriteria() {
        return new InfiniteCriteria();
    }

    @NonNull
    @Override
    public IFinishingCriteria getForwardFinishingCriteria() {
        return new InfiniteCriteria();
    }
}
