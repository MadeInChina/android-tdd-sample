
package com.hrw.android.tdd.activity;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

import com.hrw.android.R;
import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class HomeActivityTest {

    @Test
    public void should_return_app_name() throws Exception {
        assertEquals("Android Tdd Sample",
                new HomeActivity().getResources().getString(R.string.app_name));
    }
}
