package com.slesarew.robot.view.robotlist.core

import android.support.test.rule.ActivityTestRule
import com.slesarew.robot.view.robotlist.RobotListActivity
import com.slesarew.robot.view.robotlist.core.rx.RxSchedulersAsIdlingResourcesRule
import org.junit.Rule

abstract class TestSpecification {

    @get:Rule
    @Suppress("unused")
    val activityRule = ActivityTestRule(RobotListActivity::class.java)

    @get:Rule
    @Suppress("unused")
    val rxRule = RxSchedulersAsIdlingResourcesRule
}