package com.example.mtanv.drinklist;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;

/*
*
 * Instrumented test, which will execute on an Android device.
 *
  @see <a href="http://d.android.com/tools/testing">Testing documentation</a>

*/

@RunWith(AndroidJUnit4.class)
public class DrinkListTest {


    public static final String Drink = "Coke";
    public static final String GREETING_MESSAGE = "Yessss! My drink  " + Drink + "!";

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void testHintDisplayed() {
        onView(withId(R.id.txtItem)).check(matches(withHint(R.string.hintTxtItem)));
    }

   @Test
    public void testMessageDisplayed() {
        // perform typetext hello
        onView(withId(R.id.txtItem)).perform(typeText("Hello"));

       // Click on "Add Item" button
        onView(withId(R.id.btnAdd)).perform(click());

        // Now check if the text is displayed
        /*onData(anything())
                .inAdapterView(withId(android.R.id.list))
                .atPosition(0)
                .onChildView(withId(R.id.txtItem)).check(matches(withText("Hello")));*/
    }

    @Test
    public void test_additem() {

// Verify the correct item was clicked by checking the content of the status TextView
        onView(withId(R.id.btnAdd)).check(matches(withText("ADD ITEM")));

        // perform typetext hello
        onView(withId(R.id.txtItem)).perform(typeText("Hello"));
        // click on the button
        onView(withId(R.id.btnAdd)).perform(click());


        // perform typetext hello
        onView(withId(R.id.txtItem)).perform(typeText("Hello"));
        // click on the button
        onView(withId(R.id.btnAdd)).perform(click());

        // perform typetext hello
        onView(withId(R.id.txtItem)).perform(typeText("Hello"));
        // click on the button
        onView(withId(R.id.btnAdd)).perform(click());

        // perform typetext hello
        onView(withId(R.id.txtItem)).perform(typeText("Hello"));
        // click on the button
        onView(withId(R.id.btnAdd)).perform(click());


        // perform typetext hello
        onView(withId(R.id.txtItem)).perform(typeText("Hello"));
        // click on the button
        onView(withId(R.id.btnAdd)).perform(click());

        // perform typetext hello
        onView(withId(R.id.txtItem)).perform(typeText("Hello"));
        // click on the button
        onView(withId(R.id.btnAdd)).perform(click());


    }





   /* @Test
    public void testGreetingMessageWithNameDisplayed() {
        onView(withId(R.id.txtItem)).perform(typeText(Drink));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.txtItem)).check(matches(withText(GREETING_MESSAGE)));
    }
*/
    @Test
    public void test_deleteitem() {


        // Verify the correct item was clicked by checking the content of the status TextView
        onView(withId(R.id.btnDel)).check(matches(withText("Delete Selected Items")));
        // click on the button
        onView(withId(R.id.btnDel)).perform(click());

        // click on the button
        onView(withId(R.id.btnDel)).perform(click());

        // click on the button
        onView(withId(R.id.btnDel)).perform(click());

        // click on the button
        onView(withId(R.id.btnDel)).perform(click());

        // click on the button
        onView(withId(R.id.btnDel)).perform(click());


    }



}



