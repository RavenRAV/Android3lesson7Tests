package com.example.android3lesson7tests

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd(){
        runBlocking {
            Espresso.onView(withId(R.id.numFirstET)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.numFirstET)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.numSecondET)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.numSecondET)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.calculateBtn)).perform(ViewActions.click())
            delay(3000)
            Espresso.onView(withId(R.id.result))
                .check(ViewAssertions.matches(ViewMatchers.withText("9")))
        }
    }

    @Test
    fun simpleDivide(){
        runBlocking {
            Espresso.onView(withId(R.id.divFirstET)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.divFirstET)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.divSecondET)).perform(ViewActions.typeText("0"))
            Espresso.onView(withId(R.id.divSecondET)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.divCalculateBtn)).perform(ViewActions.click())
            delay(3000)
            Espresso.onView(withId(R.id.divResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("Нельзя делить на ноль")))
        }
    }

}