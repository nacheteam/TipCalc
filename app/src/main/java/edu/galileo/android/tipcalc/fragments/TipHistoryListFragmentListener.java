package edu.galileo.android.tipcalc.fragments;

import edu.galileo.android.tipcalc.models.TipRecord;

/**
 * Created by nacheteam on 4/06/16.
 */
public interface TipHistoryListFragmentListener {

    void addToList(TipRecord record);
    void clearList();
}
