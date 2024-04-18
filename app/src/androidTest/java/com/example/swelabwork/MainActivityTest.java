package com.example.swelabwork;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityActivityScenarioRule= new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void test3()
    {
        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click()).perform(ViewActions.click()).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText("Tamal")));
    }

}
