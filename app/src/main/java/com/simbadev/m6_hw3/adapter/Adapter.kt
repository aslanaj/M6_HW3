package com.simbadev.m6_hw3.adapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.simbadev.m6_hw3.ui.buttons.ButtonIncrease
import com.simbadev.m6_hw3.ui.history.History
import com.simbadev.m6_hw3.ui.changedResult.ResultNumber


class ViewPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ButtonIncrease()
            1 -> ResultNumber()
            2 -> History()
            else -> ButtonIncrease()
        }
    }
}