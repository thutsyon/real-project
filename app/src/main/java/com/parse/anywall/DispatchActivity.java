package com.parse.anywall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.ParseUser;

/**
 * Activity which starts an intent for either the logged in (MainActivity) or logged out
 * (SignUpOrLoginActivity) activity.
 */
public class DispatchActivity extends Activity {

  public DispatchActivity() {
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // If current users exists
    if (ParseUser.getCurrentUser() != null) {
      // Start an intent for the Main activity
      startActivity(new Intent(this, MainActivity.class));
    } else {
      // Start and intent for the Welcome (login/register) activity
      startActivity(new Intent(this, WelcomeActivity.class));
    }
  }

}
