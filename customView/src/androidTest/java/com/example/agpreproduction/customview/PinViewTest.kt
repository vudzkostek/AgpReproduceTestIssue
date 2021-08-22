package com.example.agpreproduction.customview

import androidx.annotation.IdRes
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.agpreproduction.customview.test.R
import org.junit.Test

class PinViewTest {

    @Test
    fun test() {
        launchActivity<TestActivity>()

        setText(R.id.view_1, "12")

        setText(R.id.view_2, "1a2B")

        setText(R.id.view_3, "12")

        setText(R.id.view_4, "123")

        setText(R.id.view_5, "1a2b")

        setText(R.id.view_6, "1a2")
    }

    private fun setText(@IdRes customViewId: Int, pin: String) {
        onView(withId(customViewId)).perform(click())
        onView(withId(customViewId)).perform(typeText(pin))
    }
}