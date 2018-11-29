package co.m.co.viewopager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import java.util.*

/**
 * @author Oscar Gallon on 11/28/18.
 */
class ViewPagerAdapter(
    private val mFragmentList: ArrayList<Fragment> = ArrayList(),
    mFragmentManager: FragmentManager
) :
    FragmentStatePagerAdapter(mFragmentManager) {


    override fun getItem(p0: Int): Fragment {
        return mFragmentList[p0]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun add(fragments: List<Fragment>) {
        mFragmentList.addAll(fragments)
        notifyDataSetChanged()
    }

    fun clear(){
        mFragmentList.clear()
        notifyDataSetChanged()
    }

}
