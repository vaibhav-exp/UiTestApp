package com.example.uitestapp

import android.os.Bundle
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.google.common.truth.Truth
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NonUiTest {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.uitestapp", appContext.packageName)
    }

    @Test
    fun bundle_putString_success() {
        val key = "key"
        val value = "value"
        val bundle = Bundle().apply {
            putString(key, value)
        }

        val fetchedValue = bundle.getString(key)

        Truth.assertThat(fetchedValue).isEqualTo(value)
    }

    @Test
    fun bundle_putString_failure() {
        val key = "key"
        val value1 = "value1"
        val value2 = "value2"
        val bundle = Bundle().apply {
            putString(key, value1)
        }

        val fetchedValue = bundle.getString(key)

        Truth.assertThat(fetchedValue).isEqualTo(value2)
    }

}