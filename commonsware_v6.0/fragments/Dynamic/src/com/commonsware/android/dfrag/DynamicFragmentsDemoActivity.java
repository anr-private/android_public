/***
  Copyright (c) 2012 CommonsWare, LLC
  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
  by applicable law or agreed to in writing, software distributed under the
  License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
  OF ANY KIND, either express or implied. See the License for the specific
  language governing permissions and limitations under the License.
  
  From _The Busy Coder's Guide to Android Development_
    http://commonsware.com/Android
 */

package com.commonsware.android.dfrag;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// See <proj-root>/ANR_README/logcat_*.log for log captures.
//
// This 'main' activity uses a static Fragment that is
// declared <fragment> in layout/main.xml and
// specifies mainfrag.xml as its content.
// (File is layout/mainfrag.xml).
//
// The 'other' activity uses a dynamic fragment that
// is created in OtherActivity.onCreate()


public class DynamicFragmentsDemoActivity extends
    LifecycleLoggingActivity {

  @Override
  public void onCreate(Bundle savedInstanceState) {

      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);

      L.d(getClass().getSimpleName() + " onCreate returns");
  }

    // Called by ContentFragment.onClick(), which forwards the
    // button-click event to us.

  public void showOther(View v) {

      L.d(getClass().getSimpleName() + " showOther: starting the other Activity");

      startActivity(new Intent(this, OtherActivity.class));
  }
}