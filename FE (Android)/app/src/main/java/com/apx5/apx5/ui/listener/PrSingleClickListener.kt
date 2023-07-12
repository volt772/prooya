package com.apx5.apx5.ui.listener

import android.os.SystemClock
import android.view.View

/**
 * OnSingleClickListener
 */
abstract class PrSingleClickListener : View.OnClickListener {
    private var lastClickTime = 0L

    abstract fun onSingleClick(view: View)

    override fun onClick(view: View?) {
        val elapsedTime = SystemClock.elapsedRealtime() - lastClickTime

        if (elapsedTime < MIN_CLICK_INTERVAL) return

        lastClickTime = SystemClock.elapsedRealtime()

        view?.let { onSingleClick(view) }
    }

    companion object {
        const val MIN_CLICK_INTERVAL = 1000L
    }
}