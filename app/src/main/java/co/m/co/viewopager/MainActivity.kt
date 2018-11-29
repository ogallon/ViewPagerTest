package co.m.co.viewopager

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var mAdapter: ViewPagerAdapter? = null

    var change = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAdapter = ViewPagerAdapter(mFragmentList = getF(), mFragmentManager = supportFragmentManager)

        vp?.adapter = mAdapter

        btn?.setOnClickListener {
            change = !change
            mAdapter?.clear()

            vp?.removeAllViews()
            vp?.adapter = mAdapter
            mAdapter?.add(getF())

        }
    }

    fun getF(): ArrayList<Fragment> {
        return if (change) {
            ArrayList<Fragment>().apply {
                add(BlankFragment.newInstance(Color.GREEN))
                add(BlankFragment.newInstance(Color.GRAY))

            }
        } else {
            ArrayList<Fragment>().apply {
                add(BlankFragment.newInstance(Color.BLUE))
                add(BlankFragment.newInstance(Color.RED))
                add(BlankFragment.newInstance(Color.YELLOW))

            }
        }
    }
}
